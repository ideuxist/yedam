package hello;

import java.util.Scanner;

public class CashExample {

	public static void main(String[] args) {
		// 2�� ���� �Է�.
		int price, cash;
		
		Scanner scn = new Scanner(System.in);// ������ �Է��ϼ���..
        System.out.println("������ �Է��ϼ���");
        price = scn.nextInt();
        double tax = price * 0.1;
        System.out.println("�մ��� �� �ݾ��� �Է��ϼ���");
        cash = scn.nextInt();
        if (cash < price ){
        	System.out.println((price+tax) - cash+"�� �����մϴ�");
        } else {
        System.out.println("�ΰ����� " +tax+"�Դϴ�");
        double finalPrice =price + tax;
        System.out.println("���������� "+ finalPrice+"�Դϴ�" );
        double returnCash = cash - price- tax;
        System.out.println("�Ž������� "+ returnCash+ "�Դϴ�");
        
       
        		
		//�մ��� �� �ݾ�
        //�ϳ��� ��ǰ�� �ΰ���, �ϳ��� �Ž�����
        //�ΰ��� �� ���
        //�Ž����� ���
       
	}

}
}