package com.prod;

public class ReferenceExample {

	public static void main(String[] args) {
		//참조타입 vs 기본 (데이터)타입
		
		int num1 = 10; // 리터럴
		int num2 = 10; //
		System.out.println(num1);
		System.out.println(num2);

		String str1 = new String("hello");
		String str2 = new String("bye");
		String str3 = "hello";
		System.out.println(str1);
		System.out.println(str2);
        System.out.println(str1.equals(str3));
	}

}
