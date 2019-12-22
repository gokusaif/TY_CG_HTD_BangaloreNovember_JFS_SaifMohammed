package com.cap.webapp.servletsjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cap.webapp.beans.EmployeeInfoBean;
import com.cap.webapp.service.EmployeeService;
import com.cap.webapp.service.EmployeeServiceImpl;
@WebServlet("/getEmployee")
public class GetEmployee extends HttpServlet{

	EmployeeService service = new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =req.getSession(false);
		if (session != null) {
			
			int empId = Integer.parseInt(req.getParameter("empId"));
			EmployeeInfoBean bean=service.searchEmployee(empId);
			 req.setAttribute("bean", bean);
			
			 req.getRequestDispatcher("./searchEmp.jsp").forward(req, resp);
			 
			
		} else {
			req.setAttribute("msg", "Login first");
			req.getRequestDispatcher("./loginFormJsp").forward(req, resp);
		}
	}
}
