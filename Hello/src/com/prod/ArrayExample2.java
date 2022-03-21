package com.prod;

public class ArrayExample2 {

	public static void main(String[] args) {
		// ages -> int
		int ages[] = new int[3];
		ages[0] = 30;
		ages[1] = 32;
		ages[2] = 35;
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum + ages[i];
			System.out.println(ages[i] + "살입니다");
			avg = sum / (double) 3;
		}
		
		System.out.printf("%.3f",33.336333);
	}

}
