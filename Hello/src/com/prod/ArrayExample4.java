package com.prod;

public class ArrayExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {25,22,17,40,28,66,44,22,88};
		int sum = 0;
		int cnt = 0;
		for (int i=0; i<numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				sum += numbers[i];
				cnt++;
			}
		}
		System.out.println("Â¦¼öÀÇ ÇÕ="+sum);
		System.out.println("Â¦¼ö°ªÀÇ Æò±Õ="+(sum/(double)cnt));
	}

}
