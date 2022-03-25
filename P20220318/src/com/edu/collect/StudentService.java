package com.edu.collect;

import java.util.List;

import com.edu.io.Student;

public interface StudentService {

	public void insertStudent(Student student); //입력
	//public Student getStudent();
	public Student getStudent(int sno);//한건조회
	public List<Student> studentList();//전체목록
	public void modifyStudent(Student student);//한건수정
	public void removeStudent(int sno);
	public List<Student> searchStudent(String name); //이름조회
	public void saveToFile();
	//Student getStudent();	
	
}
