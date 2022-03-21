package hello;

import java.util.Scanner;

public class test {
	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int val = scn.nextInt();

		if (val % 2 == 0) {
			System.out.println("짝수입니다");
		}
		if (val % 2 == 1) {
			System.out.println("홀수입니다");
		}
	}
}
