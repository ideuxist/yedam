package com.edu;

//�л�  class Student =>�ν��Ͻ� new Student
public class ObjectExample {
	public static void main(String[] args) {
		// double num2= daf
		double num2 = 12.34;
		double num3 = 20;
		// System.out.println(num3);
		int num4 = (int) 23.4;// ��������ȯ Casting
		// System.out.println(num4);
		// String str1 = new String("Hello"); //heap (�ν��Ͻ�)����
		// System.out.println(str1.equals("Hello"));
		Car car1 = new Car();// �ʱ�ȭ (�ν��Ͻ� ����)
		car1.setModel("Sonata");
		car1.setPrice(10000000);

		Student s1 = new Student(); // �ʱ�ȭ������ ���� ����
		s1.setStudNo(100);
		s1.setStudName("������");
		s1.setKorScore(90);
		s1.setEngScore(80);
		s1.setMathScore(95);
		
		System.out.println("��������:" + s1.getEngScore());
		System.out.println("�̸�:" + s1.getStudName());
		System.out.println(s1.getStudName()+"�� �հ�:"+s1.getSumScore());
		System.out.println(s1.getStudName()+"�� ���:"+s1.getAvgScore());
		
		
		
	}
}
