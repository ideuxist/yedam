package com.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryExe {
	// å���� ���� ���� >����
	// ����Ʈ �����ֱ�
	Scanner scn = new Scanner(System.in);
	Book[] library = new Book[5];//

	while(true)
	{
		
		int menu=0 ;
		while (true) {
			showMessage("�޴�����:1.å���� �Է�,2.����Ʈ����,3.����");//435
		try {
		menu = scn.nextInt();
		break;
		} catch (InputMismatchException e ) {
			System.out.println("���ڸ� ��Ȯ�� �Է��ϼ���");
			scn.next();//a
		}
		}
		if(menu==1) {
			showMessage("å������ �Է�>>");
			String title = scn.next();
			showMessage("���ڸ� �Է�>>");
			String author = scn.next();
			int price=0;
			while (true) {
				showMessage("������ �Է�>>");
				try {
				price = scn.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("������ ��Ȯ�� �Է��ϼ���");
				scn.nextInt();
				
			}
				
			
			Book book = new Book(title, author, price);
			for (int i=0 ; i <library.length; i++) {
				if (library[i] == null) {
					library[i] = book;
					break;
				}
			}
			}//asdf//asdf
		}
		 else if (menu==2) {
			for (int i=0 ; i <library.length; i++) {
				if (library[i] != null) {
					library[i].showInfo();//å���� ���� ����
					break;
				}
			}
		 }
		else if (menu==3) {
			showMessage("���α׷��� �����մϴ�");
			break;
		
		
		}
		
	} // end of while

	showMessage();



	public  void showMessage(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(300);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}//s//ss//ss
	}
}