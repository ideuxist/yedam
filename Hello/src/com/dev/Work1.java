package com.dev;
import java.util.Scanner;
public class Work1 {

	public static void main(String[] args) {
		// num1 num2 두 수 의 차를 구하는 프로그램
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하시오");
		int num1 = scn.nextInt();
		System.out.println("두번째 수를 입력하시오");
		int num2 = scn.nextInt();
		
		if ((num1-num2) >=0) {
			System.out.println(num1-num2);
		} else {
			System.out.println(num2-num1);
			
		}
		
	}

}
