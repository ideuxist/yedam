package com.dev;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		// �Է��� ��� �Է��Ҽ� �ֵ���...
		// -1 ���� �Է��ϸ�... �Է¸���
		// sum���� �Է�...
		Scanner scn = new Scanner(System.in);
		float sum = 0;
		while (true) {
			System.out.println("������ �Ǽ��� �Է��Ͻÿ�");
			float num = scn.nextFloat();
			// System.out.println("���ݱ����� ��="+ sum);
			if (num == -1) {
				break;
			}
			sum = sum + num;
		}
		System.out.println("��" + sum);

	}

}
