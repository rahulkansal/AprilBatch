package com.practice.java;

public class ClassAndObject {

	String name;
	static String profession = "IT";

	public ClassAndObject() {

		System.out.println("no parameter");
	}

	public ClassAndObject(String nameValue) {
		name = nameValue;
		System.out.println("no parameter");
	}

	public void addition(int a, int b) {
		int c = a + b;
		System.out.println(c);

	}

	public void display() {

		System.out.println("display");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 10;
		ClassAndObject classAndObject = new ClassAndObject();
		ClassAndObject classAndObject1 = new ClassAndObject();
		ClassAndObject classAndObject2 = new ClassAndObject("Kansal");
		

		classAndObject.name = "rahul";
		classAndObject1.name = "Deepa";

		// classAndObject.profession = "IT";

		System.out.println(classAndObject.name);
		System.out.println(classAndObject1.name);

		/*
		 * System.out.println(classAndObject.profession);
		 * System.out.println(classAndObject1.profession);
		 */

		classAndObject.addition(10, 20);
		System.out.println(classAndObject2.name);
		classAndObject2.display();

	}

}
