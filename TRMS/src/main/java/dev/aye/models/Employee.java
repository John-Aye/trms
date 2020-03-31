package dev.aye.models;

public class Employee {

	private String username;
	private String password;
	private String employee_type;
	private String first_name;
	private String last_name;
	private String department;
	private String supervisor;
	
	public Employee() {
		super();
		this.username = "";
		this.password= "";
		this.employee_type = "";
		this.first_name = "";
		this.last_name = "";
		this.department = "";
		this.supervisor = "";
	}

	public Employee(String username, String password, String emplyee_type, String first_name, String last_name, String department, String supervisor) {
		super();
		this.username = username;
		this.password = password;
		this.employee_type = emplyee_type;
		this.first_name = first_name;
		this.last_name = last_name;
		this.department = department;
		this.supervisor = supervisor;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmployee_type() {
		return employee_type;
	}

	public void setEmployee_type(String emplyee_type) {
		this.employee_type = emplyee_type;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	
	
}
