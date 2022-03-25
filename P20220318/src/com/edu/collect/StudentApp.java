package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.edu.io.Student;

public class StudentApp {

	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

//생성자
	public StudentApp() {
		list.add(new Student(101, "권가희", 50, 60));
		list.add(new Student(102, "유해정", 70, 80));
		list.add(new Student(103, "이유빈", 90, 70));
	}

	// 멤버 클래스
	public class StudentServiceImpl implements StudentService {

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

		@Override
		public Student getStudent() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> studentList() {
			// TODO Auto-generated method stub
			return list;

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
		public void removeStudent(int sno) {
			int cnt = 0;
			for (int i = 0; i < list.size(); i++) {

				if (list.get(i).getStuNo() == sno) {
					list.remove(i);
					System.out.println("삭제되었습니다");
				} else {
					cnt++;// fdf
				}

			}
			if (cnt > 0) {

				System.out.println("조회된 학생이 없습니다");
			} else {

			}
		}

		@Override
		public List<Student> searchStudent(String name) {
			List<Student> searchList = new ArrayList<Student>();
			// 찾으면 값 누적 종료x
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStuName().equals(name)) {
					searchList.add(list.get(i));
				}
			}
			return searchList;
		}
	}

	public void execute() {
		StudentService service = new StudentServiceImpl();
		// 메뉴 :1.추가2.리스트.3한건조회.4.수정.9종료

		while (true) {

			System.out.println("메뉴 :1.추가2.리스트.3한건조회.4.수정.5.삭제 6.이름조회 9.종료");
			System.out.println("선택>");
			int menu = scn.nextInt();
			if (menu == 1) {
				// 학생정보 입력 학생번호 이름 영어점수 국어점수

				System.out.println("학생번호 입력 >");
				int stuNo = scn.nextInt();
				System.out.println("학생이름 입력 >");
				String stuName = scn.next();
				System.out.println("영어점수 입력 >");
				int engScore = scn.nextInt();
				System.out.println("국어점수 입력 >");
				int korScore = scn.nextInt();

				Student s1 = new Student(stuNo, stuName, engScore, korScore);
				service.insertStudent(s1);
			} else if (menu == 2) {
				List<Student> list = service.studentList();
				for (Student s : list) {
					System.out.println(s.toString());
				}

			} else if (menu == 3) { // 한건조회
				System.out.println("조회할 학생번호 입력>");
				int stuNo = scn.nextInt();
				Student student = service.getStudent(stuNo);

				if (student == null) {

					System.out.println("조회된 결과가 없습니다");
				} else {
					System.out.println(student.toString());
				}

			} else if (menu == 4) {

				System.out.println("수정할 학생번호 입력 >");
				int stuNo = scn.nextInt();
				System.out.println("영어점수 입력 >");
				int engScore = scn.nextInt();
				System.out.println("국어점수 입력 >");
				int korScore = scn.nextInt();

				Student s1 = new Student(stuNo, null, engScore, korScore);
				service.modifyStudent(s1);
				System.out.println("처리가 완료되었습니다");
			} else if (menu == 5) {
				System.out.println("삭제할 학생번호 입력 >");
				int stuNo = scn.nextInt();

				service.removeStudent(stuNo);
			} else if (menu == 6) {
				System.out.println("조회할 학생이름 입력>");
				String stuName = scn.next();
				service.searchStudent(stuName);
				// System.out.println(service.);

				System.out.println(service.searchStudent(stuName));
				//return searchList
			}

			else if (menu == 9) {
				System.out.println("프로그램을 종료합니다");
				service.
				break;
			} else {

			}
		}

		System.out.println("end of program");

	}

}
