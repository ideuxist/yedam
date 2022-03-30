package com.edu.collect;

import java.util.List;

public interface StudentService {

	public void insertStudent(Student student); //입력
	//public Student getStudent();
	public Student getStudent(String stuName);//한건조회
	public List<Student> studentList();//전체목록
	public void modifyStudent(Student student);//한건수정
	public void removeStudent(int sno);
	public void searchStudent(int sno); //이름조회
	public void saveToFile();
	//Student getStudent();	
	
}
