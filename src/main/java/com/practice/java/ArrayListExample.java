package com.practice.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
		HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");   
		//Traversing elements  
		Iterator<String> itr1=set.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  }


	}

}
