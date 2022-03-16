package com.prod;

public class Employee {
	// field

	private int employeeId;
	private String employeeName;
	private String department;
	private String job;
	private int salary;

	public void setSalary(int salary) {
		if (salary < 0) {
			this.salary = 100000;
		} else {
			this.salary = salary;
		}
	}

	public int getSalary() {
		return this.salary;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return this.department;
	}
	public void setJob(String job) {
		this.job = job;
	}

	public String getJob() {
		return this.job;
	}
public String getEmpInfo() {
	String result = this.employeeName+"�� �μ���"+this.department
			+"�̰� ������" + this.job+"�̰� �޿���"+this.salary+"�Դϴ�";
return result;
}


}