package com.dev;

import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {
		// 1~10������ �� �߿��� ¦���� ���.
		// while������ �ۼ�

		// �ʱ�ȭ...
//		int i = 1;
//
//		while (i <= 10) {
//			if (i % 2 == 0) {
//				System.out.println("i�� ��=>" + i);
//			}
//			i++;
		Scanner scn = new Scanner(System.in);
		System.out.println("�μ��� �Է��ϼ���");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int min = (a<b) ? a : b;
		int gcd = 0;
		for (int i = 1; i <= min; i++) {
			if (a % i == 0 && b % i == 0)
				gcd = i;
		}
		System.out.println("�ִ�����:" + gcd);
		System.out.println("�ּҰ����:" + a*b/gcd);
		
	}



		}
	

