package com.ustglobal.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String url = "https://www.google.com";
		
		resp.sendRedirect(url);// in order to send redirect location we use thismethod
		/*
		 * String url = "http://localhost:8081/webapplication/myFirstServelet";
		 * 
		 * resp.sendRedirect(url);
		 */
	}

}
