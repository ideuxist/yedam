package com.prod;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 =new Student();
		s1.studentName = "ȫ�浿";
		s1.korScore = 80;
		s1.engScore = 90;
		String test = "Ŀ��";
		String subject = "����";
		s1.study(subject);
		s1.eat(test);
		
		
		int v1 = s1.getKorScore();
		int v2 = s1.getengscore();
		System.out.println(v1);
		System.out.println(v2);
	}

}
