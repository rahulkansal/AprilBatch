package com.practice.java;

public class ChildAbstract extends ParentAbstract{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAbstract childAbstract = new ChildAbstract();
		childAbstract.display();
		childAbstract.get();
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("child get");
	}

}
