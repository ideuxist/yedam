package com.prod;

public class Student {
	// 22-123456
	String studentNo;
	String studentName;
	int korScore;
	int engScore;

	// method : 기능.. 함수
	void study(String subject) {
		System.out.println(subject + "을(를) 공부합니다.");
	}

	void eat(String food) {
		System.out.println(food + "을(를) 먹습니다.");
	}
	int getKorScore() {
		return korScore;
	}
 int getengscore() {
	 return engScore;
 }
 



}
