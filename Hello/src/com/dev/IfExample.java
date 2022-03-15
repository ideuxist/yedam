package com.dev;

import java.util.Scanner;

public class IfExample { // WhichExample firstName first_name

	public static void main(String[] args) {
		// 조건문 if
		// 60점 이상이면 pass
		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scn.nextInt();
		if (score > 60) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
		}
		// 90점 이상이면 a 80점 이상이면 b 70점이상이면 c 60이상 d 60이하 f
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("A+입니다");
			} else {
				System.out.println("A입니다");
			}
		} else if (score >= 80) {

			if (score >= 85) {
				System.out.println("B+입니다");
			} else {
				System.out.println("B입니다");
			}
		} else if (score >= 70) {
			if (score >= 75) {
				System.out.println("C+입니다");
			} else {
				System.out.println("C입니다");
			}
		} else if (score >= 60) {
			if (score >= 65) {
				System.out.println("D+입니다");
			} else {

				System.out.println("D입니다");
			}
		} else {
			System.out.println("F입니다");
		}
		scn.close();
	}

}
