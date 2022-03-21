package hello;

import java.util.Scanner;

public class RectangleExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int xLength, yLength, area;
		System.out.println("가로 길이를 입력하세요");
		xLength = scn.nextInt();
	    System.out.println("세로 길이를 입력하세요");
		yLength = scn.nextInt();
	    area= xLength * yLength;
System.out.println("넓이는" + area +"입니다");
scn.close();
	}

}
