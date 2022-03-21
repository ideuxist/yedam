package com.dev;

import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {
		// 1~10까지의 수 중에서 짝수만 출력.
		// while문으로 작성

		// 초기화...
//		int i = 1;
//
//		while (i <= 10) {
//			if (i % 2 == 0) {
//				System.out.println("i의 값=>" + i);
//			}
//			i++;
		Scanner scn = new Scanner(System.in);
		System.out.println("두수를 입력하세요");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int min = (a<b) ? a : b;
		int gcd = 0;
		for (int i = 1; i <= min; i++) {
			if (a % i == 0 && b % i == 0)
				gcd = i;
		}
		System.out.println("최대공약수:" + gcd);
		System.out.println("최소공배수:" + a*b/gcd);
		
	}



		}
	

