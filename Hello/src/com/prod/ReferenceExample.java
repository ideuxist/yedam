package com.prod;

public class ReferenceExample {

	public static void main(String[] args) {
		//����Ÿ�� vs �⺻ (������)Ÿ��
		
		int num1 = 10; // ���ͷ�
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
