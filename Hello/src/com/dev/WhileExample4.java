package com.dev;

import java.util.Scanner;

public class WhileExample4 {

	public static void main(String[] args) {
		// 은행 계좌를 만들어서 1:입금 2:출금 3:종료
		// 입금일 경우 : 입금액을 입력하세요...account 값 누적
		// 출금일 경우 : 출금액을 입력하세요... account 값에서 차감
		// 종료일 경우 : 프로그램 종료
		int account = 0;
	    int inCash, outCash;
	    Scanner scn = new Scanner(System.in);
		while (true) {
	    System.out.println("원하시는 메뉴를 선택하세요 1.입금 2.출금 3.종료");
		int menu = scn.nextInt();
		
		if (menu == 1) {
			System.out.println("입금액을 입력하세요");
			inCash= scn.nextInt();
			account = account + inCash;
			System.out.println("현재 잔액은"+ account + "입니다");
		}else if (menu == 2) {
			System.out.println("출금액을 입력하세요");
			outCash = scn.nextInt();
			
			if (account < outCash ) {
				System.out.println("출금액은 현재 잔액을 초과 할 수 없습니다");
				System.out.println("현재 잔액은 "+ account + "입니다");
			continue; //구문 아래를 무시하고 다음순번으로 넘어감.
			} else {
				account = account - outCash;
				System.out.println("현재 잔액은 "+account + "입니다");
			}
			System.out.println("현재 잔액은"+ account + "입니다");
		
		} else {
				System.out.println("종료");
				break;
			}
		}
		}
}
