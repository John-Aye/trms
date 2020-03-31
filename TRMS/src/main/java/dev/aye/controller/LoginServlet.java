package dev.aye.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dev.aye.models.Employee;

/**
 * Servlet implementation class MasterServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sess = request.getSession();

		if (request.getParameter("username") != null || request.getParameter("password") != null) {
			EmployeeDAO ed = new EmployeeDAOImpl();
			Employee emp = ed.getEmployee(request.getParameter("username"));
			if (emp != null) {

				if (Base64.getEncoder().encodeToString(request.getParameter("password").getBytes())
						.equals(emp.getPassword())) {

					sess.setAttribute("username", emp.getUsername());
					sess.setAttribute("employee_type", emp.getEmployee_type());
					response.sendRedirect("/TRMS/EmployeeServlet");
				}
			}
		}

		request.getRequestDispatcher("/login.html").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
