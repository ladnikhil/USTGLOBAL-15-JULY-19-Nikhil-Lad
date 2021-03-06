package com.dev.dao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		
		if(session != null) {
			
		String id = req.getParameter("id");
		
		StudentInterface dao = new StudentInterfaceImplementation();
		dao.deleteStudent(Integer.parseInt(id));
		resp.sendRedirect("./login");
		
		}else {
		resp.sendRedirect("./login");
		}
	}
}
