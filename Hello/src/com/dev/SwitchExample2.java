package com.dev;
import java.util.Scanner;
public class SwitchExample2 {

	public static void main(String[] args) {
		// 90�� �̻� A 80�� �̻� B 70�� �̻� C 60�� �̻� D �׿� F
		// int score = 75 ; =>�ϳ��� ������
		Scanner scn = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score = scn.nextInt();
		int  transScore = score / 10;
		switch (score/10) {
		case 10:
			System.out.println("100��");
			break;
		case 9:
		System.out.println("A�Դϴ�");
		break;
		case 8:
			System.out.println("B�Դϴ�");
		break;
		case 7:
			System.out.println("C�Դϴ�");
			break;
			
		case 6:
			System.out.println("D�Դϴ�");
			break;
		default:
			System.out.println("F�Դϴ�");
		}
		scn.close();
		
		
		
		

	}

}
