package com.edu.collect;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceOracle extends DAO implements StudentService {

	@Override
	public void insertStudent(Student student) {
		conn=getConnect();
		String sql = "insert into student_info (student_number, student_name, eng_score,kor_score)\r\n"
				+ "values ( ?, ?,? ,?)";
		try {
			psmt= conn.prepareStatement(sql);
			psmt.setInt(1, student.getStuNo());
			psmt.setString(2, student.getStuName());
			psmt.setInt(3, student.getEngScore());
			psmt.setInt(4, student.getKorScore()); 
			int r = psmt.executeUpdate();
			System.out.println(r+"건 입력됨");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Student getStudent(String stuName) {
		conn=getConnect();
		Student student = null;
		String sql= "select * from student_info where student_name = ?";
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, stuName);
			rs=psmt.executeQuery();
			if(rs.next()); {
				student = new Student();
				student.setStuNum(rs.getInt("student_number"));
				student.setStuName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setKorScore(rs.getInt("kor_score"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return student;
	}

	@Override
	public List<Student> studentList() {
		List<Student> list = new ArrayList<Student>();
		conn = getConnect();
		String sql = "select * from student_info order by student_number";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) { //반복자를 통해 요소를 가지고 올 수있는지 체크
				Student student = new Student();
				student.setStuNum(rs.getInt("student_number"));
				student.setStuName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setKorScore(rs.getInt("kor_score"));
				
				list.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} finally {
			disconnect();
		}
		
		return list;
	}

	@Override
	public void modifyStudent(Student student) {
		conn = getConnect();
		String sql = "update student_info\r\n"
					 + "set eng_score =?,kor_score=?"
					 + "where student_number=?";
				     
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setInt(1, student.getEngScore());
			psmt.setInt(2, student.getKorScore());
			psmt.setInt(3, student.getStuNo());
			
			int r = psmt.executeUpdate();
			System.out.println(r+"건 수정됨");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
				
		
	}

	@Override
	public void removeStudent(int sno) {
		conn = getConnect();
		String sql = "delete student_info where student_number = ? ";
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setInt(1,sno);
			int r = psmt.executeUpdate();
			System.out.println(r+"건 삭제됨");
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		
		
	}

	@Override
	public void searchStudent(int sno) {
		conn = getConnect();
		Student student = null;
		String sql = "select * from student_info where student_number = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sno);
			rs=psmt.executeQuery();
			if(rs.next()); {
				student = new Student();
				student.setStuNum(rs.getInt("student_number"));
				student.setStuName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setKorScore(rs.getInt("kor_score"));
				System.out.println(student.toString());
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}

	@Override
	public void saveToFile() {
		// TODO Auto-generated method stub
		
	}

}
