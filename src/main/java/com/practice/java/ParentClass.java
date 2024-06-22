package com.practice.java;

public class ParentClass {
	
	public ParentClass() {
		System.out.println("Parent ");
	}

	 String name = "Deepa";
	
	public void addition(int a, int b) {
		System.out.println(a+b);
		
	}
	
	public void subtraction(int a, int b) {
		System.out.println(a-b);
		
	}
	
	public void subtraction(int a, int b, int c) {
		System.out.println(a-b-c);
		
	}
	
	public static void main(String[] args) {
		// TODO
		ParentClass parentClass = new ParentClass();
		parentClass.subtraction(39, 10);
	}
	


	
}
