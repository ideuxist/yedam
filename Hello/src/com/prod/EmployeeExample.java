package com.prod;

public class EmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setEmployeeId(100);
		e1.setEmployeeName("����");
		e1.setDepartment("���ߺμ�"); 
		e1.setJob("���ް��");
		//e1.salary = -1000000;
		e1.setSalary(-1000000);
//		System.out.println(e1.getSalary());
//		System.out.println(e1.getEmployeeName());
//		System.out.println(e1.getEmployeeId());
//		System.out.println((e1.getEmployeeName())+ "�� �μ��� "+(e1.getDepartment())+"�Դϴ�"
//				+ "������ "+(e1.getSalary())+"�̰�"+ "������"+(e1.getJob())+"�Դϴ�");
//		System.out.println(e1.getJob());
		System.out.println(e1.getEmpInfo());
		
		Employee e2 = new Employee();
		e2.setEmployeeId(200);
		e2.setEmployeeName("�����");
		e2.setDepartment("�ѹ���");
		e2.setJob("��ǰ����");
		e2.setSalary(1000000);
		
		System.out.println(e2.getEmpInfo());
		
	}

}
