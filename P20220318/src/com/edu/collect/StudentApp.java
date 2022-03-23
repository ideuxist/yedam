package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

	// 멤버 클래스
	public class StudentSeriveImpl implements StudentService {

		@Override
		public void insertStudent(Student student) {
			list.add(student); // 추가
		}

		@Override
		public Student getStudent(int sno) { // 학생번호로 한건조회
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStuNo() == sno) {
					return list.get(i);
				}
			}
			return null;
		}

	}

	@Override
	public void modifyStudent(Student student) {// 수정
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStuNo() == student.getStuNo()) {
				list.get(i).setEngScore(student.getEngScore());
				list.get(i).setKorScore(student.getKorScore());
			}
		}
	}

	@Override
	public com.edu.collect.List<Student> studentList() {
		// TODO Auto-generated method stub
		return null;
	}

	}

	public void execute() {
		// 메뉴 :1.추가2.리스트.3한건조회.4.수정.9종료
		System.out.println("메뉴 :1.추가2.리스트.3한건조회.4.수정.9종료");
		System.out.println("선택하세요");
		int menu = scn.nextInt();
		while (true) {
			if (menu == 1) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println("학생번호를 입력");
				}
			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 9)

				break;
			} else {
				
			}
	}

	System.out.println("end of program");

}

}
