package com.edu.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample2 {
	public static void main(String[] args) {
		
	
	List<Student> list = new ArrayList<Student>();
	list.add(new Student("홍길동", "남자", 80, 160));
	list.add(new Student("심청이", "여자", 90,180));
	list.add(new Student("임꺽정", "남자", 50,100));
	list.add(new Student("유재석", "남자", 100,200));
	 
	//남자 여자 관계없이 score+point > 260이상인 학생들만 출력
	list.stream()
	//.filter(student -> student.score+student.point>=260)
	.sorted()
	.forEach(student -> System.out.println(student));

	
	//	
//	list.stream()
//	.filter(student -> student.score >= 80)
//	.filter(student -> student.gender.equals("여자"))
//	.forEach(student -> System.out.println(student));

}
}