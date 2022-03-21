package com.dev;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		// Math.random(); 0~1 사이의 임의의 실수를 생성
		int ranVal = (int) (Math.random() * 3) + 1;
		// System.out.println(ranVal);
		Scanner scn = new Scanner(System.in);
		System.out.println("1~3중 하나의 숫자를 입력하세요");
		int choiceNum = scn.nextInt();

		if (choiceNum == ranVal) {
			System.out.println("축하합니다 당첨");
		} else {
			System.out.println("꽝 다음기회에");
		}

		scn.close();
	}

}
