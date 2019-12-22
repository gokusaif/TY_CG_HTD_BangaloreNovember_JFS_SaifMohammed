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
@WebServlet("/updateEmployee2")
public class UpdateEmp extends HttpServlet{
	 EmployeeService service = new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session= req.getSession(false);
		if(session!=null) {
			int empId=Integer.parseInt(req.getParameter("empId"));
			String password = req.getParameter("password");
			String name = req.getParameter("name");
			String salary=req.getParameter("salary");
			String age = req.getParameter("age");
			String designation = req.getParameter("designation");
			EmployeeInfoBean eBean = new EmployeeInfoBean();
			
			if(age!=null && !age.isEmpty()) {
				int ageVal = Integer.parseInt(age);
				eBean.setAge(ageVal);
			}
			
			if(salary!=null && !salary.isEmpty()) {
				double salaryVal = Double.parseDouble(salary);
				eBean.setSalary(salaryVal);
			}
			eBean.setEmpId(empId);
			eBean.setName(name);
			eBean.setPassword(password);
			eBean.setDesignation(designation);
			
			if(service.updateEmployee(eBean)) {
				req.setAttribute("msg", "Employe details updated");
			} else {
				req.setAttribute("msg", "Employe details not updated");
				
			}
			req.getRequestDispatcher("./updateEmp.jsp").forward(req, resp);

		} else {
			req.setAttribute("msg", "Login first");
			req.getRequestDispatcher("./loginForm.jsp").forward(req, resp);
		}
	}

}
