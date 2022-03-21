package com.edu;

//학생  class Student =>인스턴스 new Student
public class ObjectExample {
	public static void main(String[] args) {
		// double num2= daf
		double num2 = 12.34;
		double num3 = 20;
		// System.out.println(num3);
		int num4 = (int) 23.4;// 강제형변환 Casting
		// System.out.println(num4);
		// String str1 = new String("Hello"); //heap (인스턴스)생성
		// System.out.println(str1.equals("Hello"));
		Car car1 = new Car();// 초기화 (인스턴스 생성)
		car1.setModel("Sonata");
		car1.setPrice(10000000);

		Student s1 = new Student(); // 초기화시점에 값을 지정
		s1.setStudNo(100);
		s1.setStudName("김형민");
		s1.setKorScore(90);
		s1.setEngScore(80);
		s1.setMathScore(95);
		
		System.out.println("영어점수:" + s1.getEngScore());
		System.out.println("이름:" + s1.getStudName());
		System.out.println(s1.getStudName()+"의 합계:"+s1.getSumScore());
		System.out.println(s1.getStudName()+"의 평균:"+s1.getAvgScore());
		
		
		
	}
}
