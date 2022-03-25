package com.edu.collect;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.edu.io.Student;

public class StudentServiceFile implements StudentService{
	

	List<Student> list = new ArrayList<Student>();
	File file;
	
	
	
	@Override
	public void insertStudent(Student student) {
		list.add(student);
		
	}

	@Override
	public Student getStudent(int sno) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStuNo() == sno) {
				return list.get(i);
		
	}
		}return null;
	}

	
	@Override
	public void saveToFile() {
		//작성했던 ArrayList<Student> list>파일저장
//		FileWriter fw ;
//		
		try {
			FileWriter fw = new FileWriter("studentList.data");
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (Student st:list) {
				bw.write(st.getStuName(),st.getEngScore(),st.getKorScore());
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		 (IOException e) 
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		
//		BufferedWriter bw = new BufferedWriter(fw);
//		for (Student stud : list) {
//			bw.write(stud.getStuNo()+","+stud.getStuName()+","+stud.getEngScore()+","+stud.getKorScore());
			
		}
	

	@Override
	public void modifyStudent(Student student) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStuNo() == student.getStuNo()) {
				list.get(i).setEngScore(student.getEngScore());
				list.get(i).setKorScore(student.getKorScore());
			}
		}
		
	}

	@Override
	public List<Student> studentList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeStudent(int sno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> searchStudent(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
