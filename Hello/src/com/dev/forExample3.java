package com.dev;

import java.util.Scanner;

public class forExample3 {

	public static void main(String[] args) {
		// �Է¹޴� �μ��� num1 num2
		// num1 �� num2 ������ ���� �� ���ؼ�
		// System.out.println(num1 +"����"+num2+"������ ��:"+sum);
		Scanner scn = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��ϼ���");
		int num1 = scn.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���");
		int num2 = scn.nextInt();
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum = sum + i;
		}
		System.out.println(num1 + "����" + num2 + "������ ��:" + sum);
		scn.close();
//int num3=3;
//	System.out.println(num3);
//	{System.out.println(num3);	
//int num=5;
	}
}
