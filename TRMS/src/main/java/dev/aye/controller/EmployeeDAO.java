package dev.aye.controller;

import java.util.ArrayList;

import dev.aye.models.Employee;

public interface EmployeeDAO {

	public boolean addEmployee(Employee emp);
	public ArrayList<Employee> getEmployees();
	public Employee getEmployee(String username);
}
