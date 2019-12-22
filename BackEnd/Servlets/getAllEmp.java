package com.cap.webapp.servletsjsp;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cap.webapp.beans.EmployeeInfoBean;
import com.cap.webapp.service.EmployeeService;
import com.cap.webapp.service.EmployeeServiceImpl;
@WebServlet("/getAll")
public class getAllEmp extends HttpServlet{

	EmployeeService service = new EmployeeServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session= req.getSession(false);
		if(session!=null) {
			List<EmployeeInfoBean> l1=service.getAllEmployees();
			if(l1!=null && !l1.isEmpty()) {
				req.setAttribute("msg", "All employee details");
				req.setAttribute("all",l1);
				req.getRequestDispatcher("./getAllEmp.jsp").forward(req, resp);
			} else {
				req.setAttribute("msg", "No data");
				req.getRequestDispatcher("./getAllEmp.jsp").forward(req, resp);
			}
			
		} else {
			req.setAttribute("msg", "Login first");
			req.getRequestDispatcher("./loginForm.jsp").forward(req, resp);
		}
	}
	
}
