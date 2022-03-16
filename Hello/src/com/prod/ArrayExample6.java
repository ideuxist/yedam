package com.prod;

public class ArrayExample6 {
	public static void main(String[] args) {
		int[] numbers = {25,22,17,39,28,66,44,22,88};
		// 배열의 값이 30보다 크고 40보다 작은 값의 합 평균
		int sum =0;
		double avg =0;
		double cnt =0;
		for (int i=0; i<numbers.length; i++) {
			if (30<numbers[i] && numbers[i]<40) {
				sum +=numbers[i];
				cnt++;
							}
			

		}
		avg = sum/cnt;
		System.out.println("30과40사이의 수의합"+sum);
		System.out.println("수의 평균"+avg);
		System.out.println(numbers.length);
	}
}
