package com.dev;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		// 입력을 계속 입력할수 있도록...
		// -1 값을 입력하면... 입력멈춤
		// sum값에 입력...
		Scanner scn = new Scanner(System.in);
		float sum = 0;
		while (true) {
			System.out.println("임의의 실수를 입력하시오");
			float num = scn.nextFloat();
			// System.out.println("지금까지의 합="+ sum);
			if (num == -1) {
				break;
			}
			sum = sum + num;
		}
		System.out.println("끝" + sum);

	}

}
