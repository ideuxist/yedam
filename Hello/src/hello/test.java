package hello;

import java.util.Scanner;

public class test {
	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int val = scn.nextInt();

		if (val % 2 == 0) {
			System.out.println("¦���Դϴ�");
		}
		if (val % 2 == 1) {
			System.out.println("Ȧ���Դϴ�");
		}
	}
}
