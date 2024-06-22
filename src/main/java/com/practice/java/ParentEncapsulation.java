package com.practice.java;

public class ParentEncapsulation {
	
	private String name;
	
	ParentEncapsulation a;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void objectDisplay(ParentEncapsulation a) {
		this.a=a;
		
	}

}
