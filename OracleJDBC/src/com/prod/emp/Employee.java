package com.prod.emp;

public class Employee {
	//employees 테이블의 칼럼에해당되는 필드설정.
	private int employeeId; //employees.employee_id
	private String firstName; //         first_name
	private String lastName;//          last_name
	private String email;
	private String salary;
	private String hireDate;
	private String jobId;
	private String phoneNumber;
	
	public Employee() {};
	
	public Employee(int employeeId) {
	}
	
	public Employee(int employeeId, String firstName, String lastName, String email, String salary, String hireDate,
			String jobId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
		this.hireDate = hireDate;
		this.jobId = jobId;
	}
	
	
	
	public Employee(int employeeId, String firstName, String lastName, String email, String salary, String hireDate,
			String jobId, String phoneNumber) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.phoneNumber = phoneNumber;
	}
	
	public Employee(int employeeId,String phoneNumber,String firstName,String salary ) {
		this.employeeId = employeeId;
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.salary = salary;
	}
	

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fistName) {
		this.firstName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", salary=" + salary + ", hireDate=" + hireDate + ", jobId=" + jobId + "]";
	}
	
	
}
