package com.prod;

public class ArrayExample3 {
	public static void main(String[] args) {
		String[] names = new String[5]; // 초기값 null
		names[0] = "홍길동";
		names[1] = "234";
		names[2] = "권경완";
		names[3] = "예담";

		names[1] = "이삼사";
		names[4] = "권경완";
		names[0] = null;
		String searchName = "예담";
		for (int i = 0; i < 5; i++) {
//			if (names[i] != null) {
//				System.out.println(names[i]);
//			}
			if (names[i] != null && names[i].equals(searchName)) {
				System.out.println(i+1+"번째 위치에 있습니다.");
			}
			//int scores[] = new int[] {1,1,1,1,1,1,1};
			//int add(int[] scores) {1,1,1,1,1}
		}
	}

}
