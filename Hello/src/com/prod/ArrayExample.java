package com.prod;

public class ArrayExample {

	public static void main(String[] args) {
		int[] scores = new int[5];
		scores[0]=42;
		scores[1]=65;
		scores[2]=76;
		//scores[3]=98;
		//scores[4]=88;
		
//		for (int i=0; i<5; i++) {
//		System.out.println(scores[i]);
//		System.out.println(scores[0]+scores[2]);
		//배열을 활용해서 sum =>avg
		int sum =0;
		
		for (int i = 0; i<5; i++) {
			sum += scores[i];
			
		}
	double avg = sum /(double)5;
	System.out.println(avg);
	
	
	}

}

