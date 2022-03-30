package com.prod.emp;

import java.util.List;
import java.util.Scanner;

public class EmpExe {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();

		// 메뉴 : 1.사원리스트 2.신규입력 3.수정 4.삭제 5.한건조회 0.종료
		while (true) {
//				 int employeeId; //employees.employee_id
//				 String firstName; //         first_name
//				 String lastName;//          last_name
//				 String email;
//			     String salary;
//				 String hireDate;
//				 String jobId;

			System.out.println("1.사원리스트 2.신규입력 3.수정 4.삭제 5.한건조회 0.종료");
			System.out.println("메뉴선택>>");
			int menu = scn.nextInt();

			if (menu == 1) { // 전체 리스트보기
				List<Employee> list = dao.empList();

				System.out.println("사원리스트");
				for (Employee emp : list) {
					System.out.println(emp.toString());
				}
			} else if (menu == 2) { // 신규입력
				// 사원번호 lastName email hireDate jobId

				System.out.println("사원번호 입력");
				int employeeId = scn.nextInt();
				System.out.println("성 입력");
				String firstName = scn.next();
				System.out.println("이름 입력");
				String lastName = scn.next();
				System.out.println("이메일 입력");
				String email = scn.next();
				System.out.println("급여 입력");
				String salary = scn.next();
				System.out.println("입사일 입력");
				String hireDate = scn.next();
				System.out.println("전화번호 입력");
				String phoneNumber = scn.next();
				System.out.println("jobId");
				String jobId = scn.next();
				Employee emp = new Employee(employeeId, firstName, lastName, email, salary, hireDate, jobId,
						phoneNumber);
				//boolean tOrF = dao.insertEmp(emp);

//					Employee emp = new Employee();
//					System.out.println("사원번호 입력");
//					int employeeId = scn.nextInt();
//					emp.setEmployeeId(employeeId);
//					System.out.println("성 입력");
//					String firstName = scn.next();
//					emp.setFirstName(firstName);
//					System.out.println("이름 입력");
//					String lastName = scn.next();
//					
//					emp.setLastName(lastName);
//					System.out.println("이메일 입력");
//					String email = scn.next();
//					emp.setEmail(email);
//					System.out.println("급여 입력");
//					String salary = scn.next();
//					emp.setSalary(salary);
//					System.out.println("입사일 입력");
//					String hireDate = scn.next();
//					emp.setFirstName(hireDate);
//					System.out.println("jobId");
//					String jobId = scn.next();
//					emp.setJobId(jobId);
//					
//				dao.insertEmp(emp);
//					
//					

			} else if (menu == 3) { // 수정
				// 사원번호, 전화번호, firstName, salary

				System.out.println("수정 사원번호 입력>");
				int employeeId = scn.nextInt();

				System.out.println("새로운 전화번호입력");
				String phoneNumber = scn.next();
				System.out.println("firstName 입력");
				String firstName = scn.next();
				System.out.println("급여입력");
				String salary = scn.next();
				Employee emp2 = new Employee(employeeId, phoneNumber, firstName, salary);

				dao.updateEmp(emp2);
				

			} else if (menu == 4) { // 삭제
				System.out.println("삭제할 사원번호 입력");
				int employeeId = scn.nextInt();
				dao.deleteEmp(employeeId);
			} else if (menu == 5) {// 한건조회
				System.out.println("조회할 사원번호 입력");
				int employeeId = scn.nextInt();
				
				Employee emp = new Employee (employeeId);
				
				dao.searchEmployee(emp);

			} else {
				System.out.println("프로그램종료");
				break;
			}
		} // end of while
		System.out.println("프로그램 종료");

	}// end of main

}
