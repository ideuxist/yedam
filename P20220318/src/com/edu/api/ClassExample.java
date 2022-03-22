package com.edu.api;

import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) {
		// String System Member => 관리하는 class

		Class cls = String.class;
		try {
			cls = Class.forName("Java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cls.getName();
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		Method[] methods = cls.getMethods();
		
		for(Method met : methods) {
			System.out.println("메소드이름: " +met.getName());
		}
		
		cls = Member.class;
		
		String path = cls.getResource("ClassExample.class").getPath();
		System.out.println(path);
		

	}

}
