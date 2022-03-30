package com.prod.emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO extends DAO {

	
	
	//전체조회
	public List<Employee> empList() {
		List<Employee> employees = new ArrayList<Employee>();
		conn = super.getConnect();
		try {
			psmt = conn.prepareStatement("select * from emp_java");
			rs=psmt.executeQuery();
			
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getString("salary"));
				emp.setJobId(rs.getString("job_id"));
				emp.setHireDate(rs.getString("hire_date").substring(0,10));
				employees.add(emp);
				
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				super.disconnect();
			}
		return employees;
		}
		
	
	//한건조회
	
	//입력처리
	public void insertEmp(Employee emp) {
		conn = getConnect();
		String sql= "insert into emp_java (employee_id, last_name, email, hire_date, job_id)\r\n "
				+ "values ( ?, ? , ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1,emp.getEmployeeId());
			psmt.setString(2, emp.getLastName());
			psmt.setString(3, emp.getEmail());
			psmt.setString(4, emp.getHireDate());
			psmt.setString(5, emp.getJobId());
			int r = psmt.executeUpdate();
			System.out.println(r+ "건 입력됨.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally //정상실행, 예외발생 =>반드시 실행코드 
		 {
			disconnect();
			
		}
		
	}
	//수정처리
	public void updateEmp(Employee emp) {
		conn = getConnect();
		String sql = "update emp_java " 
				+ "set first_name = ?, "
				+ "phone_number = ?, "
				+ "salary = ? "
				+ "where employee_id = ?"; //쿼리 작성 =>
		try {
			psmt = conn.prepareStatement(sql);
			//파라메터값을지정
			psmt.setString(1, emp.getFirstName());
			psmt.setString(2, emp.getPhoneNumber());
			psmt.setString(3, emp.getSalary());
			psmt.setInt(4, emp.getEmployeeId());

			
			
			int r = psmt.executeUpdate();
			System.out.println(r+"건 수정됨");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}
	
	//삭제처리

	public void searchEmployee(int empId) {
		Employee emp = null;
		
		conn = getConnect();
		String sql = "select * from emp_java\r\n"
				     +"where employee_id = ?";

		try {
//			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, emp.getEmployeeId());
//			rs=psmt.executeQuery();
//			rs.next();
//			emp2.setEmployeeId(rs.getInt("employee_id"));
//			emp2.setLastName(rs.getString("last_name"));
//			emp2.setFirstName(rs.getString("first_name"));
//			emp2.setSalary(rs.getString("salary"));
//			emp2.setJobId(rs.getString("job_id"));
//			System.out.println(emp2.toString());
			
			psmt= conn.prepareStatement(sql);
			psmt.setInt(1, empId);
			rs= psmt.executeQuery();
			if(rs.next());
			emp=new Employee();
			emp.setEmployeeId((rs.getInt("employee_id")));
			
		}
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
			
		}
	}
		
		public void deleteEmp(int empId) {
			conn = getConnect();
			String sql = "delete emp_java where employee_id = ? ";
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setInt(1, empId);
				int r = psmt.executeUpdate();
				System.out.println(r+"건 삭제됨");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				disconnect();
			}
			
		}	
		
		
		
		
		
	}




