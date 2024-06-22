package com.practice.java;

public class ExceptionHandlingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	         int a[] = new int[2];
	         System.out.println("Access element three :" + a[3]);
	      } catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("Exception thrown  :" + e);
	      }finally {
	    	   // The finally block always executes.
	    	  System.out.println("finally");
	    	  }


		System.out.println("After Exception");
	}

}
