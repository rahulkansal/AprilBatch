package com.practice.java;

public class ChildClass extends ParentClass{

	String name="Rahul";
	
	public ChildClass() {
		super();
		System.out.println("Child");
	}
	
	public void addition(int a, int b) {
		System.out.println(a+b+a+b);
		
		System.out.println(super.name);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass childClass = new ChildClass();
		childClass.addition(10, 20);
		childClass.subtraction(30, 10);
		
		
	}

}
