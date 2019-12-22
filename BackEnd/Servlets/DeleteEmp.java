package com.cap.webapp.servletsjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cap.webapp.service.EmployeeService;
import com.cap.webapp.service.EmployeeServiceImpl;
@WebServlet("/deleteEmp1")
public class DeleteEmp extends HttpServlet{
	EmployeeService service = new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session= req.getSession(false);

		int empId = Integer.parseInt(req.getParameter("empId"));
		
		if(session!=null) {
			if(service.deleteEmployee(empId)) {
				req.setAttribute("msg", "Employee details for "+empId+" deleted");
				req.getRequestDispatcher("./deleteEmp.jsp").forward(req, resp);
			} else {
				req.setAttribute("msg", "Employee details for "+empId+" not found");
				req.getRequestDispatcher("./deleteEmp.jsp").forward(req, resp);
			}
		} else {
			req.setAttribute("msg", "Login first");
			req.getRequestDispatcher("./loginForm.jsp").forward(req, resp);
		}
	}


}
