package com.prod;

public class MemberExample {
	public static void main(String[] args) {
		// int num1=10;
		// String name = "ȫ�浿";
		// ���� number = "ȫ�浿", 10; ���� ��������
		Member mem1 = new Member();
		// mem1.name = "ȫ�浿";
		// mem1.age = 20;

		Member mem2 = new Member(); // �ʱ�ȭ �ʼ�
		mem2.name = "�μ�";
		mem2.age = 25;

		System.out.println("mem1�� name�Ӽ�:" + mem1.name);
		System.out.println("mem1�� age�Ӽ�:" + mem1.age);

		Student st1 = new Student();
		st1.studentNo = "22-123456";
		st1.studentName = "�迵��";
		st1.korScore = 55;
		st1.engScore = 60;
	}
}
