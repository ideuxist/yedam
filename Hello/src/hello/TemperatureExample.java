package hello;

import java.util.Scanner;

public class TemperatureExample {

	public static void main(String[] args) {
	 // c= 5/9(f-32) ȭ�� �µ��� ���� �µ��� ���� ��Ģ
		Scanner scn = new Scanner(System.in);
		double fDeg, cDeg;
		System.out.println("ȭ���µ��� �Է��ϼ���");
		fDeg= scn.nextDouble();
		cDeg=(double)5/9*(fDeg-32);
		//boolean result=cDeg >= 30.0;
		System.out.println("�����µ���"+cDeg+"�Դϴ�");
		if (cDeg >= 30) {
			System.out.println("������ ������׿�");
		} else  {
			System.out.println("�츸�ϳ׿�");
		}
	    scn.close();
		// 30.0 ���� ũ�� "������ ������׿�" �׿ܴ� "�츸�ϳ׿�"
	}

}
