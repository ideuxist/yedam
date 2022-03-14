package hello;

import java.util.Scanner;

public class TemperatureExample {

	public static void main(String[] args) {
	 // c= 5/9(f-32) 화씨 온도를 섭씨 온도로 변경 규칙
		Scanner scn = new Scanner(System.in);
		double fDeg, cDeg;
		System.out.println("화씨온도를 입력하세요");
		fDeg= scn.nextDouble();
		cDeg=(double)5/9*(fDeg-32);
		//boolean result=cDeg >= 30.0;
		System.out.println("섭씨온도는"+cDeg+"입니다");
		if (cDeg >= 30) {
			System.out.println("오늘은 더운날씨네요");
		} else  {
			System.out.println("살만하네요");
		}
	    scn.close();
		// 30.0 보다 크면 "오늘은 더운날씨네요" 그외는 "살만하네요"
	}

}
