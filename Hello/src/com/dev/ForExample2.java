package com.dev;

public class ForExample2 {

	public static void main(String[] args) {
		int sum = 0;
		int startCnt = 11;
		int lastCnt = 20 ;
		for (int i=startCnt; i <= lastCnt; i++) {
			if( i % 2 ==0) {
				sum = sum + i;
			//System.out.println(i);
		}
		}
		System.out.println("Â¦¼öÀÇ ÇÕ" +sum);
//		for (int i=4; i <=6; i++) {
//			System.out.println(i);
//		}
	}

}
