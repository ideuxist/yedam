package com.edu.collect;

import java.util.List;

public interface StudentService {

	public void insertStudent(Student student); //입력
	public Student getStudent();//한건조회
	public Student getStudent(int sno);
	public List<Student> studentList();//전체목록
	public void modifyStudent(Student student);//한건수정
		
	
}
