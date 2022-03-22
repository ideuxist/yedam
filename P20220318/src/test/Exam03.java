package test;

import java.util.Scanner;

//문제3) 정수형배열 선언하고 사용자로 세개의 정수값을 입력받아서 배열에 저장. 제일 큰값을 구하는 코드를 작성.
public class Exam03 {
	public static void main(String[] args) {
		int[] num = new int[3];
		int a = 0;
		Scanner scn = new Scanner(System.in);

		for (int i = 0; i < num.length; i++) {
			System.out.println("[" + (i + 1) + "] 번째 수를 입력하세요");
			num[i] = scn.nextInt();
			if (a < num[i]) {
				a = num[i];
			} else {

			}
		}
		System.out.println("가장 큰수는 =>" + a);

	}
}
