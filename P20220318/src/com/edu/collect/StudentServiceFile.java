package com.edu.collect;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

//StudentServiceTmpl(중첩클래스의 기능대체
// 입력 수정 삭제=> 파일에 저장되도록
public class StudentServiceFile implements StudentService {

//기본생성자에 파일에 저장되어 있는 파일정보를 읽어서 list 값을 담아준다

	List<Student> list;// = new ArrayList<Student>();
	File file;

	public StudentServiceFile() {
		list = new ArrayList<Student>();
		try {
			FileReader fr = new FileReader("studentList.data");
			BufferedReader br = new BufferedReader(fr);
			String readBuffer = null;
			while ((readBuffer = br.readLine()) != null) {
				String[] contents = readBuffer.split(",");
				// ,를 기준으로 분리
				// contents[0] => 101 contents[1] =>홍길동
				// contents[2] => 80 contents[4] => 90
				list.add(new Student(Integer.parseInt(contents[0]), contents[1], Integer.parseInt(contents[2]),
						Integer.parseInt(contents[0])));

			}
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

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
		}
		return null;
	}

	@Override
	public void saveToFile() {
		// 작성했던 ArrayList<Student> list>파일저장
//		FileWriter fw ;
//		
		try {
			FileWriter fw = new FileWriter("studentList.data");
			BufferedWriter bw = new BufferedWriter(fw);
			// 보조스트림의 생성자의 매개값으로 기본스트림
			for (Student st : list) {
				bw.write(st.getStuNo() + "," + st.getStuName() + "," + st.getEngScore() + "," + st.getKorScore()+"\n");
				bw.close();
				fw.close();
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
		return list;
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
