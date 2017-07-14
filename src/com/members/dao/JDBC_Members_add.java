package com.members.dao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JDBC_Members_add")
public class JDBC_Members_add extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	MembersDAO_implements mem_DAO = new MembersDAO_implements();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MembersVO mem_VO = new MembersVO();
		mem_VO.setMem_no("");
		mem_VO.setMem_acc("");
		mem_VO.setMem_rank("1");
		mem_VO.setMem_nickname(mem_nickname);
		mem_DAO.add(mem_VO);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
