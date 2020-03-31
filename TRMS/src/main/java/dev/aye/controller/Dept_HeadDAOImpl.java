package dev.aye.controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dev.aye.models.Dept_Head;
import dev.aye.models.Employee;

public class Dept_HeadDAOImpl implements Dept_HeadDAO{

	private static Connection conn = JDBCConnection.getConnection();
	
	@Override
	public boolean addDeptHead(Employee emp) {
		
		try {
			
			String sql = "call add_dept_head(?,?,?,?,?,?,?";
			CallableStatement cs = conn.prepareCall(sql);
			cs.setString(1, emp.getUsername());
			cs.setString(2, emp.getPassword());
			cs.setString(3, emp.getEmployee_type());
			cs.setString(4, emp.getFirst_name());
			cs.setString(5, emp.getLast_name());
			cs.setString(6, emp.getDepartment());
			cs.setString(7, emp.getSupervisor());
			
			cs.execute();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
