package com.edu.api;

public class StringExam2 {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다");
			break;
		}
		String strVal = new String("신민철");
		String strVal2 = "신민철";
		
		if (strVal == strVal2) {
			System.out.println("같은 String 객체를 참조");
			
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if (strVal.equals(strVal2)) {
			System.out.println("같은문자열을 가짐");
			
		}else {
			System.out.println("다른문자열을 가짐");
		}
		
		
		
		
		
	}
}// dsf
