package com.prod;

public class ArrayExample7 {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		int num1 = 15;
		int num2 = 20;
		int tmp=num1;
		num1=num2;
		num2=tmp;
		
		
		
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
		
		int[] numbers = new int [2];
		numbers[0]=15;
		numbers[1]=20;
		tmp = numbers[0];
		numbers[0]=numbers[1];
		numbers[1]=tmp;
	
		
		
		System.out.println("¹Ù²ï Ã¹¹øÂ°: "+numbers[0]);
		System.out.println("¹Ù²ï µÎ¹øÂ°: "+numbers[1]);
	}

}
