package com.test;

import java.util.Scanner;

//臾몄젣1) �젙�닔�삎 蹂��닔 num1, num2 瑜� �꽑�뼵�븯怨� �몢 �닔 以묒뿉�꽌 �겙 �닔�뿉�꽌 �옉�� �닔瑜� 類� 寃곌낵瑜� ���옣�븯�뒗 蹂��닔 result.ddd
public class Exam01 {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.println(" �븘臾댁닔�굹 �엯�젰�븯�꽭�슂");
		int num1 = scn.nextInt();
		System.out.println("�븘臾댁닔�굹 �엯�젰�븯�꽭�슂");
		int num2 = scn.nextInt();
		
		
		if (num1 < num2 ) {
			System.out.println("�몮 以� �뜑 �겙�닔�뒗 " + num2);
			
		}else { 
		System.out.println("�몮 以� �뜑 �겙�닔�뒗 " +num1);
		}
		
	}
}
