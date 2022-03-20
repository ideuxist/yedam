package com.test;

import java.util.Scanner;

//문제1) 정수형 변수 num1, num2 를 선언하고 두 수 중에서 큰 수에서 작은 수를 뺀 결과를 저장하는 변수 result.
public class Exam01 {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.println(" 아무수나 입력하세요");
		int num1 = scn.nextInt();
		System.out.println("아무수나 입력하세요");
		int num2 = scn.nextInt();
		
		
		if (num1 < num2 ) {
			System.out.println("둘 중 더 큰수는 " + num2);
			
		}else { 
		System.out.println("둘 중 더 큰수는 " +num1);
		}
		
	}
}
