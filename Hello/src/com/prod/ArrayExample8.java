package com.prod;

import java.util.Scanner;

public class ArrayExample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] numbers = new int[2];

		System.out.println("ù��° ���� �Է��Ͻÿ�..");
		numbers[0] = scn.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻÿ�..");
		numbers[1] = scn.nextInt();

		if (numbers[0] > numbers[1]) {
			int tmp = numbers[0];
			numbers[0] = numbers[1];
			numbers[1] = tmp;

		}

		System.out.println("ù��°�� :" + numbers[0]);
		System.out.println("�ι�°�� :" + numbers[1]);
		scn.close();

	}

}
