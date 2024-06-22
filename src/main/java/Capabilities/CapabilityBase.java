package Capabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Pages.Base;
import Pages.Login;
import Utility.FileUtility;


public class CapabilityBase {
	public static String subFolderPath ="";
	public static File path;
	public static ExtentReports extentReport ;
    public static ExtentTest extentTest ;
    public static WebDriver driver = null ;
    public Base base;
    public Login login;
    public static Map<String, String> testData = new HashMap<String, String>();
	
	public static void generateReport()
    {
    
        subFolderPath =  System.getProperty("user.dir") + "/Reports/";
        String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        Calendar calendar = Calendar.getInstance();
        int iMonth = calendar.get(Calendar.MONTH);
        String sMonthName = monthName[iMonth];
        String userName = System.getProperty("user.name");
        String timeStamp =  FileUtility.Timestamp();

        path = FileUtility.CreateFolder(subFolderPath);
        path =  FileUtility.CreateFolder(path.getAbsolutePath() + "/" + userName);
        path = FileUtility.CreateFolder(path.getAbsolutePath()+ "/" + sMonthName);
        path = FileUtility.CreateFolder(path.getAbsolutePath()+ "/" + timeStamp);

        extentReport = new ExtentReports(path.getAbsolutePath()+"\\ExtentReport.html");

        path = FileUtility.CreateFolder(path.getAbsolutePath()+"\\ScreenShots");

        extentReport.addSystemInfo("Environment","UAT");
       // extentReport.addSystemInfo("Environment", testData.get("Environment"));
        extentReport.loadConfig(new File(System.getProperty("user.dir")+"\\src\\main\\resources\\extent\\extent-config.xml"));

    }
	
	public WebDriver launchBrowser(String browser) {

		String dir = System.getProperty("user.dir");
		if (browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", dir + "\\src\\main\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
		}

		else if (browser.equalsIgnoreCase("edge")) {

			//System.setProperty("webdriver.edge.driver", dir + "\\src\\main\\resources\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		return driver;

	}
	
	public void excelSheetReading(String excelSheetFileName,String sheetName) throws IOException {
        // for testData (fetching all the sheets' data)
        String projectDir = System.getProperty("user.dir");

        FileInputStream fileInputStream = new FileInputStream(projectDir + "\\Excel\\" + excelSheetFileName + ".xlsx");
        System.out.println(fileInputStream);
        XSSFWorkbook workbook = null;
        workbook = new XSSFWorkbook(fileInputStream);
        
        //for (int sheetCount = 0; sheetCount < sheetNames.length; sheetCount++){
        XSSFSheet sheet = workbook.getSheet(sheetName);
        for (int rowCount = 0; rowCount < sheet.getPhysicalNumberOfRows(); rowCount++){
            Cell cell = sheet.getRow(rowCount).getCell(1);
            if (cell.getCellType() == Cell.CELL_TYPE_STRING)
                testData.put(sheet.getRow(rowCount).getCell(0).getStringCellValue(),
                        sheet.getRow(rowCount).getCell(1).getStringCellValue());
     

        }
        // }
    }

	@BeforeSuite
	public void beforeSuite() {
		try {
	excelSheetReading("TestData","login");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		generateReport();
	}
	
	@BeforeMethod
	public void beforeMethod(ITestResult result) {
		launchBrowser("Edge");
		base = new Base();	
		login = new Login();
		
		String methodName = result.getMethod().getMethodName();
        extentTest = extentReport.startTest(methodName);
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	
	@AfterSuite
	public void afterSuite() {
		extentReport.flush();
	}
	
	
	
}
