package com.edu.collect;

import java.util.ArrayList;
import java.util.List;

import com.edu.io.Student;

public class StudentExample {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();

		Student s1 = new Student();
		Student s2 = new Student(101, "권경완", 100, 100);
		Student s3 = new Student(102, "김주환",100,100);
		Student s4 = new Student(103, "이재학",100,100);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		Student result = list.get(1);
		System.out.println("첫번째 "+result.toString());
		list.get(1);
		list.set(1, new Student(201, "김경완",100,100));
		// 첫번째 인스턴스 변경
		list.get(1).setEngScore(50);
		result = list.get(1);//첫번째 인스턴스의 값을 변경
		list.remove(1); //삭제 처리
		result = list.get(1);
		
		System.out.println("첫번째 "+result.toString());

	}
}
