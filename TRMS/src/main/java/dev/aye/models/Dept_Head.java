package dev.aye.models;

public class Dept_Head {

	private String department;
	private String username;
	private String first_name;
	private String last_name;
	
	public Dept_Head() {
		super();
		this.department = "";
		this.username = "";
		this.first_name = "";
		this.last_name = "";
	}

	public Dept_Head(String department, String username, String first_name, String last_name) {
		super();
		this.department = department;
		this.username = username;
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
	
	
}
