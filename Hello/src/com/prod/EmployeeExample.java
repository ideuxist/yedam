package com.prod;

public class EmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setEmployeeId(100);
		e1.setEmployeeName("김사원");
		e1.setDepartment("개발부서"); 
		e1.setJob("월급계산");
		//e1.salary = -1000000;
		e1.setSalary(-1000000);
//		System.out.println(e1.getSalary());
//		System.out.println(e1.getEmployeeName());
//		System.out.println(e1.getEmployeeId());
//		System.out.println((e1.getEmployeeName())+ "의 부서는 "+(e1.getDepartment())+"입니다"
//				+ "월급은 "+(e1.getSalary())+"이고"+ "직무는"+(e1.getJob())+"입니다");
//		System.out.println(e1.getJob());
		System.out.println(e1.getEmpInfo());
		
		Employee e2 = new Employee();
		e2.setEmployeeId(200);
		e2.setEmployeeName("이재빈");
		e2.setDepartment("총무부");
		e2.setJob("비품구매");
		e2.setSalary(1000000);
		
		System.out.println(e2.getEmpInfo());
		
	}

}
