package com.dev;

import java.util.Scanner;

public class forExample3 {

	public static void main(String[] args) {
		// 입력받는 두수를 num1 num2
		// num1 과 num2 사이의 값을 다 더해서
		// System.out.println(num1 +"부터"+num2+"까지의 합:"+sum);
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요");
		int num1 = scn.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int num2 = scn.nextInt();
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum = sum + i;
		}
		System.out.println(num1 + "부터" + num2 + "까지의 합:" + sum);
		scn.close();
//int num3=3;
//	System.out.println(num3);
//	{System.out.println(num3);	
//int num=5;
	}
}
