package hello;

import java.util.Scanner;

public class ScannerExample { // hello.ScannerExample
   public static void main (String[] arg) {
	   Scanner scn = new Scanner(System.in);
//	System.out.println("ù��° ���ڸ� �Է��ϼ���.");
//	int val = scn.nextInt();
//	System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
//	int val2 = scn.nextInt();
//	int val3 = val + val2 ;
//	System.out.println("�μ��� ����" + val3 + "�Դϴ�.");
	System.out.println("ù��° ���ڸ� �Է��ϼ���.");
	int val = scn.nextInt();
	
	if(val % 2 == 0 ) {
		System.out.println("¦���Դϴ�");
	}
	if(val %2 == 1  ) {
		System.out.println("Ȧ���Դϴ�");
	}
	//Scanner scn2 = new Scanner(System.in);
	//int val2 = scn2.nextInt();
	//System.out.println("�Է°��� " + val2 +"�Դϴ�");
   }
}

