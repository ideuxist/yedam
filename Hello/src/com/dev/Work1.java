package com.dev;
import java.util.Scanner;
public class Work1 {

	public static void main(String[] args) {
		// num1 num2 �� �� �� ���� ���ϴ� ���α׷�
		Scanner scn = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��Ͻÿ�");
		int num1 = scn.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻÿ�");
		int num2 = scn.nextInt();
		
		if ((num1-num2) >=0) {
			System.out.println(num1-num2);
		} else {
			System.out.println(num2-num1);
			
		}
		
	}

}
