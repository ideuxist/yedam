package com.dev;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		// Math.random(); 0~1 ������ ������ �Ǽ��� ����
		int ranVal = (int) (Math.random() * 3) + 1;
		// System.out.println(ranVal);
		Scanner scn = new Scanner(System.in);
		System.out.println("1~3�� �ϳ��� ���ڸ� �Է��ϼ���");
		int choiceNum = scn.nextInt();

		if (choiceNum == ranVal) {
			System.out.println("�����մϴ� ��÷");
		} else {
			System.out.println("�� ������ȸ��");
		}

		scn.close();
	}

}
