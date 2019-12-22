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
@WebServlet("/insertEmployee")
public class insertEmployee extends HttpServlet {

	EmployeeService service = new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			int empId=Integer.parseInt(req.getParameter("empId"));
			String password = req.getParameter("password");
			String name = req.getParameter("name");
			double salary=Double.parseDouble(req.getParameter("salary"));
			int age = Integer.parseInt(req.getParameter("age"));
			String designation = req.getParameter("designation");
			EmployeeInfoBean eBean = new EmployeeInfoBean();
			eBean.setAge(age);
			eBean.setEmpId(empId);
			eBean.setName(name);
			eBean.setSalary(salary);
			eBean.setPassword(password);
			eBean.setDesignation(designation);
			if(service.addEmployee(eBean)) {
				req.setAttribute("msg", "Employee details added");
			

			} else {
				req.setAttribute("msg", "Employee details not added");
			}
			req.getRequestDispatcher("./insertEmployee.jsp").forward(req, resp);


		} else {
			req.setAttribute("msg", "Login first");
			req.getRequestDispatcher("./loginForm.jsp").forward(req, resp);
		}

	}
}
