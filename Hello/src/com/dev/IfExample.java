package com.dev;

import java.util.Scanner;

public class IfExample { // WhichExample firstName first_name

	public static void main(String[] args) {
		// ���ǹ� if
		// 60�� �̻��̸� pass
		Scanner scn = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score = scn.nextInt();
		if (score > 60) {
			System.out.println("�հ��Դϴ�");
		} else {
			System.out.println("���հ��Դϴ�");
		}
		// 90�� �̻��̸� a 80�� �̻��̸� b 70���̻��̸� c 60�̻� d 60���� f
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("A+�Դϴ�");
			} else {
				System.out.println("A�Դϴ�");
			}
		} else if (score >= 80) {

			if (score >= 85) {
				System.out.println("B+�Դϴ�");
			} else {
				System.out.println("B�Դϴ�");
			}
		} else if (score >= 70) {
			if (score >= 75) {
				System.out.println("C+�Դϴ�");
			} else {
				System.out.println("C�Դϴ�");
			}
		} else if (score >= 60) {
			if (score >= 65) {
				System.out.println("D+�Դϴ�");
			} else {

				System.out.println("D�Դϴ�");
			}
		} else {
			System.out.println("F�Դϴ�");
		}
		scn.close();
	}

}
