package com.dev;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		for (int i = 1; i<=5; i++) {
			System.out.println("i��=>"+ i);
		
		}
		//while
//		int i = 1;
//		while (i<=5) {
//			System.out.println("i��=>"+i);
//			i++;//������
//		int num = 0;
//		while(true) {
//			System.out.println("num�ǰ�=>"+num);
//			num++;
//			if (num>5) {
//				break; //�ݺ����� ��������
//			}
//		}
//	//while
//		while(true) {
//			int rand = (int) (Math.random()* 10 )+1;
//			System.out.println("������ ������ ��:"+rand);
//			if (rand==8) {
//				break;
//			}
//			
//		}
//		
//		
//		
//		System.out.println("end of prog");
//	}
		Scanner scn = new Scanner(System.in);
		int randomVal, userVal;

		
			randomVal = (int) (Math.random() * 5) + 1;
			while (true) {
		System.out.println("������ ���� �Է�(1~5)");
		userVal = scn.nextInt();
		if (randomVal == userVal) {
			System.out.println("������ ������ ���� �����ϴ�.");
			break;

		}
}
}
}