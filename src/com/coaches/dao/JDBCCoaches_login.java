package com.coaches.dao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestJDBCDAO1
 */
@WebServlet("/TestJDBCDAO1")
public class JDBCCoaches_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CoachesDAO_implements dao = new CoachesDAO_implements();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
