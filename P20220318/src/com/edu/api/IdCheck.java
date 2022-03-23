package com.edu.api;

public class IdCheck {
	// 주민번호 입력 -> 950304-1234567, 000205-3223231
	// 주민번호로 남녀구분 950304-123456,950304 1234567 9503021234567
	// String getGender() ->남자 , 여자

	String Id;
	
	
	void gender(String ssn) {
		
		char targetChar = Id.charAt(6);
		switch (targetChar) {

		case '1':
		case '3':
			System.out.println("남자입니다");
			
			break;

		case '2':
		case '4':
			System.out.println("여자입니다");
			
			break;
		default :
			System.out.println("올바른 주민번호를 입력하세요");
		}
		

	}
	
}
	
