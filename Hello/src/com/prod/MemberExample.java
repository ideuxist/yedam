package com.prod;

public class MemberExample {
	public static void main(String[] args) {
		// int num1=10;
		// String name = "홍길동";
		// 변수 number = "홍길동", 10; 등을 담고싶을때
		Member mem1 = new Member();
		// mem1.name = "홍길동";
		// mem1.age = 20;

		Member mem2 = new Member(); // 초기화 필수
		mem2.name = "민수";
		mem2.age = 25;

		System.out.println("mem1의 name속성:" + mem1.name);
		System.out.println("mem1의 age속성:" + mem1.age);

		Student st1 = new Student();
		st1.studentNo = "22-123456";
		st1.studentName = "김영희";
		st1.korScore = 55;
		st1.engScore = 60;
	}
}
