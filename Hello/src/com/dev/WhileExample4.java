package com.dev;

import java.util.Scanner;

public class WhileExample4 {

	public static void main(String[] args) {
		// ���� ���¸� ���� 1:�Ա� 2:��� 3:����
		// �Ա��� ��� : �Աݾ��� �Է��ϼ���...account �� ����
		// ����� ��� : ��ݾ��� �Է��ϼ���... account ������ ����
		// ������ ��� : ���α׷� ����
		int account = 0;
	    int inCash, outCash;
	    Scanner scn = new Scanner(System.in);
		while (true) {
	    System.out.println("���Ͻô� �޴��� �����ϼ��� 1.�Ա� 2.��� 3.����");
		int menu = scn.nextInt();
		
		if (menu == 1) {
			System.out.println("�Աݾ��� �Է��ϼ���");
			inCash= scn.nextInt();
			account = account + inCash;
			System.out.println("���� �ܾ���"+ account + "�Դϴ�");
		}else if (menu == 2) {
			System.out.println("��ݾ��� �Է��ϼ���");
			outCash = scn.nextInt();
			
			if (account < outCash ) {
				System.out.println("��ݾ��� ���� �ܾ��� �ʰ� �� �� �����ϴ�");
				System.out.println("���� �ܾ��� "+ account + "�Դϴ�");
			continue; //���� �Ʒ��� �����ϰ� ������������ �Ѿ.
			} else {
				account = account - outCash;
				System.out.println("���� �ܾ��� "+account + "�Դϴ�");
			}
			System.out.println("���� �ܾ���"+ account + "�Դϴ�");
		
		} else {
				System.out.println("����");
				break;
			}
		}
		}
}
