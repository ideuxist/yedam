package com.edu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
	String name;
	String gender;
	int score;
	int point;

	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	public Student(String name, String gender, int score, int point) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
		this.point = point;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", score=" + score + ", point=" + point + "]";
	}

	@Override
	public int compareTo(Student student) {
		//this 와 student 비교 :this, student or student this
		//=> 음수 => 오름차순 양수=> 내림차순
//		if (this.point >student.point) {
//			return -1;
//		}else {
//			return 1;
//		}
		return (this.score +this.point) - (student.score+student.point);
	}
	
}

public class StreamExample {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", "남자", 80));
		list.add(new Student("심청이", "여자", 90));
		list.add(new Student("임꺽정", "남자", 50));
		list.add(new Student("유재석", "남자", 100));
		//평균 구하기
		
		int sum =0, cnt = 0;
		double avg=0;
		for (Student student : list ) {
			if(student.gender.equals("남자")) {
				sum += student.score;
				cnt++;
			}
		}
		avg= sum / (double) cnt;
		System.out.println("컬렉션 평균값:"+avg);
		Stream<Student> stream = list.stream();// 스트림 생성
		OptionalDouble od =stream.filter((s)->s.gender.equals("남자"))//
		.mapToInt(s->s.score).average();
		avg= od.getAsDouble();
		System.out.println("스트림평균:" + avg);
//		stream.forEach(new Consumer<Student>() {
//
//			@Override
//			public void accept(Student t) {
//				System.out.println("이름:" + t.name + " 성별:" //
//						+ t.gender + " 점수:" + t.score);
//
//			}
//		});

	}
}
