package com.dev;

import java.util.Scanner;

//BankApp(main method), Account(���¹�ȣ,������,�ܾ�)
public class BankApp {
	static Account[] banks = new Account[100];
	static Scanner scn = new Scanner(System.in);

	// �޴� :1.���»���(��ȣ ������ ���ݾ�)
	// 2.����(��ȣ �Է� �� ���ݾ�) => �ְ� ���ݰ��ɾ� 10����
	// 3.���(��ȣ,��ݾ�) =>�ܾ׺��� ū �ݾ� ��ݺҰ�
	// 4.�ܾ���ȸ(��ȣ)
	// 5.����.
	public static void main(String[] args) {
		while (true) {
			printMenu();
			int menu = scn.nextInt();
			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				deposit();

			} else if (menu == 3) {
				withdraw();
			} else if (menu == 4) {
				findAccountMoney();
			} else if (menu == 5) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			} else if (menu == 9) {
				showList();
			}
		}
		System.out.println("===end of program");
	}

	// �޴������ ���
	public static void printMenu() {
		String menu = "=============================================\r\n" //
				    + " 1.���»���(��ȣ ������ ���ݾ�)\r\n"//
				    + " 2.����(��ȣ �Է� �� ���ݾ�) => �ְ� ���ݰ��ɾ� 10����\r\n" //
				    + " 3.���(��ȣ,��ݾ�) =>�ܾ׺��� ū �ݾ� ��ݺҰ�\r\n" //
				    + " 4.�ܾ���ȸ(��ȣ)\r\n"//
				    + " 5.����.\r\n" + "=============================================\r\n" 
				    + " ����> ";//
		System.out.print(menu);//
	}

//���»��� �޼ҵ�
	public static void createAccount() {
		System.out.println("���»������");
		System.out.print("���¹�ȣ�Է�>>");
		String accNo = scn.next();
		System.out.print("�������Է�>>");
		String accName = scn.next();
		System.out.print("���ݾ� �Է�>>");
		int accMoney = scn.nextInt();
		Account accnt = new Account(accNo, accName, accMoney);

		for (int i = 0; i < banks.length; i++) {
			if (banks[i] == null) {
				banks[i] = accnt;
				break;
			}
		}
		System.out.println("���°� ���������� �����Ǿ����ϴ�.");
	}

//���� �޼ҵ�
	public static void deposit() {
		System.out.println("���ݱ��");
		System.out.println("���¹�ȣ>> ");
		String ano = scn.next();
		System.out.println("���ݾ� �Է�>> ");
		int amt = scn.nextInt();
		int checkCnt = 0; //��ȸ�� �ƴ��� üũ ���� ����
		for (int i=0; i<banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(ano)) {//���°� �������
				//���¹�ȣ ��ȸ������
				checkCnt=1;
				int currAmt = banks[i].getMoney();
				
				//���ݾ��� 10������ �ʰ����� ���ϵ���
				if (currAmt + amt >100000) {
					checkCnt= 2;
					
				    
					break;	
				}
 				banks[i].setMoney(currAmt+amt); // �ܾ� + �Աݾ�
				break;
			
		
		if (checkCnt==1) {
		System.out.println("���������� ó���Ǿ����ϴ�.");
		} else if (checkCnt==2) {
			System.out.println("�Ա��ѵ����� �ʰ��߽��ϴ�.");
		}
		else {
			System.out.println("���¹�ȣ�� �����ϴ�.");
		}
	
		
	}
	


//��� �޼ҵ�
	public static void withdraw() {
		System.out.println("��ݱ��");
	}

//�ܾ���ȸ �޼ҵ�
	public static void findAccountMoney() {
		System.out.println("�ܾ���ȸ���");
	}

	// ��ü ����Ʈ ���
	public static void showList() {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null) {
				System.out.println(banks[i].toString());

			}

		}
	}
}