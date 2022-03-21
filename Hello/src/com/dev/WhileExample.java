package com.dev;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		for (int i = 1; i<=5; i++) {
			System.out.println("i값=>"+ i);
		
		}
		//while
//		int i = 1;
//		while (i<=5) {
//			System.out.println("i값=>"+i);
//			i++;//증감식
//		int num = 0;
//		while(true) {
//			System.out.println("num의값=>"+num);
//			num++;
//			if (num>5) {
//				break; //반복문을 빠져나옴
//			}
//		}
//	//while
//		while(true) {
//			int rand = (int) (Math.random()* 10 )+1;
//			System.out.println("임의의 생성된 값:"+rand);
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
		System.out.println("임의의 값을 입력(1~5)");
		userVal = scn.nextInt();
		if (randomVal == userVal) {
			System.out.println("생성된 임의의 값과 같습니다.");
			break;

		}
}
}
}