package com.prod;

public class Student {
	// 22-123456
	String studentNo;
	String studentName;
	int korScore;
	int engScore;

	// method : ���.. �Լ�
	void study(String subject) {
		System.out.println(subject + "��(��) �����մϴ�.");
	}

	void eat(String food) {
		System.out.println(food + "��(��) �Խ��ϴ�.");
	}
	int getKorScore() {
		return korScore;
	}
 int getengscore() {
	 return engScore;
 }
 



}
