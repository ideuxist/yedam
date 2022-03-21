package com.prod;

public class ArrayExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {25,22,17,40,28,66,44,22,88};
		//홀수번째 수의 합   0  1  2  3  4  5  6  7  8
		int sum =0;
		for (int i=0; i<numbers.length;i++) {
//			int j = i % 2;
//			if (j == 0) {
			if (i % 2 == 1) {
			
			sum+=numbers[i];
		}
	
	}
		int sum2 = 22 +  40 + 66 + 22;
		System.out.println("홀수번째 수의합="+sum);
		System.out.println(numbers.length);
		System.out.println(sum2);
	}
}
 