package com.edu.api;

public class SystemExample {
	public static void main(StringExam1[] args) {
		
		System.out.println("start");
	//	System.exit(0);
		System.out.println("end");
		
		
		
		long currentTime=System.currentTimeMillis(); //현재시간을 1970.1.1 기준
		System.out.println(currentTime);
		
		long days = currentTime / (24*60*60*1000);
		System.out.println(days);
		long years= days/365;
		System.out.println(years);
		
		currentTime=System.currentTimeMillis();
		long sum=0;
		for (int i = 0; i<1000000000; i++) {
			sum +=i;
		}
		System.out.println("summary:"+sum);
		long endTime=System.currentTimeMillis();
		System.out.println("연산에 걸린시간:"+ (endTime-currentTime));
		
		
		

	}
}
