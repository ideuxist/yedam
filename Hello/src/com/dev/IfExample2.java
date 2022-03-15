package com.dev;
import java.util.Scanner;
public class IfExample2 {

	public static void main(String[] args) {
		// 물건의 가격이 50000원 이상이면 배송비 0
		// 그외는 배송비 3000원
		
		//결재할 금액이 얼마인지를 보여주는 코드.
		Scanner scn = new Scanner(System.in);
		System.out.println("물건의 값을 입력하세요");
		int price = scn.nextInt();
//		if (price >= 50000) {
//			System.out.println("결재하실 금액은 "+ price +" 원입니다");
//		}
//		else {
//			System.out.println("결재하실 금액은"+ (price + 3000) +"원입니다");
//	}
	    price = (price >= 50000) ? price : price + 3000;
	    System.out.println("결재하실 금액은 "+ price +" 입니다");
	
	
	
	
	scn.close();
		
		
		

	}

}
