package com.coach.dao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestJDBC_DAO
 */
@WebServlet("/TestJDBCDAO")
public class JDBCDAO_registered extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CoachDAO_implements dao = new CoachDAO_implements();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		CoachVO coa1 = new CoachVO();
		coa1.setCoa_acc(req.getParameter("coa_acc"));
		coa1.setCoa_psw(req.getParameter("coa_psw"));
		coa1.setCoa_sex(Integer.valueOf(req.getParameter("coa_sex")));
		coa1.setCoa_mail(req.getParameter("coa_mail"));
		
		dao.add(coa1);
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
