package dev.aye.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dev.aye.models.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	private static Connection conn = JDBCConnection.getConnection();
	
	@Override
	public boolean addEmployee(Employee emp) {
		
		try {
			
			
			String sql = "insert into employees values(?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, emp.getUsername());
			ps.setString(2, emp.getPassword());
			ps.setString(3, emp.getEmployee_type());
			ps.setString(4, emp.getFirst_name());
			ps.setString(5, emp.getLast_name());
			ps.setString(6, emp.getDepartment());
			ps.setString(7, emp.getSupervisor());
			
			ps.execute();
			
			return true;
		} catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public ArrayList<Employee> getEmployees() {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		try {
			
			String sql = "select * from employees";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				employees.add(new Employee(
						rs.getString("username"),
						rs.getString("password"),
						rs.getString("emplyee_type"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("department"),
						rs.getString("supervisor")
						));
			}
		} catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return employees;
	}

	@Override
	public Employee getEmployee(String username) {
		
		try {
			
			String sql = "Select * from employees where username = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Employee emp = new Employee(
						rs.getString("username"),
						rs.getString("password"),
						rs.getString("employee_type"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("department"),
						rs.getString("supervisor")
						);
				
				return emp;
			}
		} catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
}
