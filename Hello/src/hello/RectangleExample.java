package hello;

import java.util.Scanner;

public class RectangleExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int xLength, yLength, area;
		System.out.println("���� ���̸� �Է��ϼ���");
		xLength = scn.nextInt();
	    System.out.println("���� ���̸� �Է��ϼ���");
		yLength = scn.nextInt();
	    area= xLength * yLength;
System.out.println("���̴�" + area +"�Դϴ�");
scn.close();
	}

}
