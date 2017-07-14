package com.coaches.dao;

import java.sql.*;

public class CoachesDAO_implements implements CoachDAO_interface {

	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "SERVLET_XIANGZHI";
	private static final String password = "0958771608";
	private static final String add_members = "Insert into members (mem_no, mem_acc, mem_rank, mem_nickname)"
			+ "values(mem_no_seq.nextval, ?, ?, ?)";
	private static final String add_coaches = "Insert into coaches (coa_acc, coa_no, coa_psw, coa_name, coa_sex, coa_id,coa_mail,"
			+ "coa_into, coa_pic, coa_pft) values(?,?,?,?,?,?,?,?,?)";
	private static final String update = "update coaches ";
	private static final String login = "";
	
	Connection con = null;
	PreparedStatement pre = null;
	
	@Override
	public void add(CoachesVO coach) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void login(CoachesVO coach) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(CoachesVO coach) {
		// TODO Auto-generated method stub
		
	}

	
	
}
