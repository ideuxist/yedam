package hello;

import java.util.Scanner;

public class CashExample {

	public static void main(String[] args) {
		// 2개 값을 입력.
		int price, cash;
		
		Scanner scn = new Scanner(System.in);// 가격을 입력하세요..
        System.out.println("가격을 입력하세요");
        price = scn.nextInt();
        double tax = price * 0.1;
        System.out.println("손님이 낸 금액을 입력하세요");
        cash = scn.nextInt();
        if (cash < price ){
        	System.out.println((price+tax) - cash+"원 부족합니다");
        } else {
        System.out.println("부가세는 " +tax+"입니다");
        double finalPrice =price + tax;
        System.out.println("최종가격은 "+ finalPrice+"입니다" );
        double returnCash = cash - price- tax;
        System.out.println("거스름돈은 "+ returnCash+ "입니다");
        
       
        		
		//손님이 낸 금액
        //하나는 상품의 부가세, 하나는 거스름돈
        //부가세 값 출력
        //거스름돈 출력
       
	}

}
}