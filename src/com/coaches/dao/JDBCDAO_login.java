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
public class JDBCDAO_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CoachDAO_implements dao = new CoachDAO_implements();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		CoachVO coa1 = new CoachVO();
		coa1.setCoa_acc(req.getParameter("coa_acc"));
		coa1.setCoa_psw(req.getParameter("coa_psw"));
		
		if(dao.login(coa1)){
			req.setAttribute("",0);
			req.getRequestDispatcher("").forward(req, res);
		}
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
