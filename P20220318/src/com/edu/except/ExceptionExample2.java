package com.edu.except;

import java.util.Calendar;
import java.util.Scanner;

public class ExceptionExample2 {
	public static void main(String[] args) {

		// Object class
		
		Object obj = new String();
		obj = new Scanner(System.in);
		obj = Calendar.getInstance();
		obj = new Object();
		System.out.println("obj의 해시코드:" + obj.hashCode());
		
		
		
		try {
			Class.forName("java.lang.String1");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			System.out.println("해당 클래스가 존재하지 않습니다");

		}

		String str = null;
		try {
			str.charAt(0); // CharSequence
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("NullPoint Error발생");
			e.printStackTrace();

		}

		String nums1 = "백";
		String nums2 = "이백";
		int num1, num2;

		try {
			num1 = Integer.parseInt(nums1);
			num2 = Integer.parseInt(nums1);
			str.charAt(0);
		} catch (NumberFormatException e) {
			num1 = 0;
			num2 = 0;
		}
		System.out.println("상위의 예외발생");

		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		// System.out.println(Integer.parseInt(num1);
try {
	showError();
	
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}
		
		
		
		
		System.out.println("end of prog");
	}// end of main

	public static void showError() throws ClassNotFoundException{
		
		Class.forName("Java.lang.Strings");
		

	} 
}
