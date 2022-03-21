package com.edu;

public class Person {
	// field
	private String name;
	private int age;
	private double heigt;
	private double weigt;
	
	//constructor
	public Person() {
		
	}
	
	//overloading 
	public Person(String name) {
		this.name = name;
	}
	
	
	public Person(String name, int age, double heigt, double weigt) {
		super();
		this.name = name;
		this.age = age;
		this.heigt = heigt;
		this.weigt = weigt;
	}

	// method

	public void setName(String name) {
		this.name = name;

	}
	public String getName() {
		return this.name;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeigt() {
		return heigt;
	}
	public void setHeigt(double heigt) {
		this.heigt = heigt;
	}
	public double getWeigt() {
		return weigt;
	}
	public void setWeigt(double weigt) {
		this.weigt = weigt;
	}

}
