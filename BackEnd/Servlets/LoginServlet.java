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
@WebServlet("/login2")
public class LoginServlet extends HttpServlet {

	private EmployeeService service = new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int empId=Integer.parseInt(req.getParameter("empId"));
		String pass=req.getParameter("password");
		EmployeeInfoBean bean=service.authenticate(empId, pass);
		if (bean != null) { //valid credentials
			HttpSession session= req.getSession(true);
			session.setAttribute("bean",bean); // set attribute
			
			session.setMaxInactiveInterval(60*10); //60 sec after that logout automatically
			req.getRequestDispatcher("./homePage.jsp").forward(req, resp);
			
		} else { //invalid credentials
			req.setAttribute("msg", "Invalid credentials");
			req.getRequestDispatcher("./loginFormJsp").forward(req, resp);
		}
	}
	
	
}
