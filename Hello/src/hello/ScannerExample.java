package hello;

import java.util.Scanner;

public class ScannerExample { // hello.ScannerExample
   public static void main (String[] arg) {
	   Scanner scn = new Scanner(System.in);
//	System.out.println("첫번째 숫자를 입력하세요.");
//	int val = scn.nextInt();
//	System.out.println("두번째 숫자를 입력하세요.");
//	int val2 = scn.nextInt();
//	int val3 = val + val2 ;
//	System.out.println("두수의 합은" + val3 + "입니다.");
	System.out.println("첫번째 숫자를 입력하세요.");
	int val = scn.nextInt();
	
	if(val % 2 == 0 ) {
		System.out.println("짝수입니다");
	}
	if(val %2 == 1  ) {
		System.out.println("홀수입니다");
	}
	//Scanner scn2 = new Scanner(System.in);
	//int val2 = scn2.nextInt();
	//System.out.println("입력값은 " + val2 +"입니다");
   }
}

