package com.dev;
import java.util.Scanner;
public class IfExample2 {

	public static void main(String[] args) {
		// ������ ������ 50000�� �̻��̸� ��ۺ� 0
		// �׿ܴ� ��ۺ� 3000��
		
		//������ �ݾ��� �������� �����ִ� �ڵ�.
		Scanner scn = new Scanner(System.in);
		System.out.println("������ ���� �Է��ϼ���");
		int price = scn.nextInt();
//		if (price >= 50000) {
//			System.out.println("�����Ͻ� �ݾ��� "+ price +" ���Դϴ�");
//		}
//		else {
//			System.out.println("�����Ͻ� �ݾ���"+ (price + 3000) +"���Դϴ�");
//	}
	    price = (price >= 50000) ? price : price + 3000;
	    System.out.println("�����Ͻ� �ݾ��� "+ price +" �Դϴ�");
	
	
	
	
	scn.close();
		
		
		

	}

}
