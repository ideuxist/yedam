package hello;

import java.util.Scanner;

public class CalExample {

	public static void main(String[] args) {
		// �� �Է� ->�� �� �ʷ� ��������
		Scanner scn = new Scanner(System.in);
		int hour, miniture, second, inputval;
		System.out.println("�������� �Է��ϼ���");
		inputval = scn.nextInt();
		hour = inputval / 3600;
		System.out.println(hour + "�ð�");
		miniture = inputval % 3600 / 60;
		System.out.println(miniture + "��");
		second = inputval % 60;
		System.out.println(second + "��");
		scn.close();
	}

}
