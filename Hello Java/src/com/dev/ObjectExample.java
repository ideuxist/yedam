package com.dev;

import java.util.Scanner;

import com.edu.Student;

public class ObjectExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Student s1 = new Student(100, "이가영"); // studNo= 100
		System.out.println(s1.getStudNo());
		System.out.println(s1.getStudName());

		s1.setKorScore(100);
		s1.setEngScore(60);
		s1.setMathScore(80);

		Student s2 = new Student(101, "이혜린", 80, 82, 85);
		System.out.printf(s2.getStudName() + "의 평균: %.2f", s2.getAvgScore());
		System.out.println();
		Student s3 = new Student(102, "서현일", 70, 80, 90);
		Student s4 = new Student(102, "최규완", 77, 82, 83);

		Student[] students = { s1, s2, s3, s4 };

		while (true) {
			
		
		
		System.out.println("조회하려는 학생의 이름:(ex:홍길동)");
		String searchName = scn.next();
		if(searchName.equals("종료")) {
			System.out.println("종료");
			
			break;
		}

		for (int i = 0; i < students.length; i++) {
			if (students[i].getStudName().equals(searchName)) {
				System.out.println(students[i].getStudInfo());
			}
			students[0].getAvgScore();
			students[1].getStudName();

		}
	}

}
}