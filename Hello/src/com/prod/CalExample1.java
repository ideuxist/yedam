package com.prod;

public class CalExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		System.out.println(cal.PI);
		int number1 = 10;
		int number2 = 20;
		        //호출하는 부분 =>매개값,  매개값
		int result = cal.add(number1, number2);
		System.out.println(result);
		int result2 = cal.minus(number1,number2);
		System.out.println(result2);
		double area = cal.getRectArea(number1, number2);
		System.out.println(area);
		double r= 4.5;
		area= cal.getCircleArea(r);
		System.out.println(area);
		
	}

}
