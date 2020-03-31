package dev.aye.controller;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Base64;
import java.util.Properties;
import java.util.Scanner;
import java.util.regex.Pattern;

import dev.aye.models.Dept_Head;
import dev.aye.models.Employee;

public class JDBCConnection {

	public static Connection conn = null;

	private static final String url = "jdbc:oracle:thin:@revwork.cndliedewvre.us-east-2.rds.amazonaws.com:1521:ORCL";
	private static final String username = "admin";
	private static final String password = "password";

	public static Connection getConnection() {

		try {

			if (conn == null) {

				Class.forName("oracle.jdbc.driver.OracleDriver");

				conn = DriverManager.getConnection(url, username, password);
			}

			return conn;
		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;
	}
}
