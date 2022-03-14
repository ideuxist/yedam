package hello;

import java.util.Scanner;

public class CalExample {

	public static void main(String[] args) {
		// 초 입력 ->시 분 초로 변경하자
		Scanner scn = new Scanner(System.in);
		int hour, miniture, second, inputval;
		System.out.println("몇초인지 입력하세요");
		inputval = scn.nextInt();
		hour = inputval / 3600;
		System.out.println(hour + "시간");
		miniture = inputval % 3600 / 60;
		System.out.println(miniture + "분");
		second = inputval % 60;
		System.out.println(second + "초");
		scn.close();
	}

}
