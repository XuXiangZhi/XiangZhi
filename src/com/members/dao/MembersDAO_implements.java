package com.members.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MembersDAO_implements implements MembersDAO_interface{
	
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "SERVLET_XIANGZHI";
	private static final String password = "0958771608";
	private static final String add_members = "Insert into members (mem_no, mem_acc, mem_rank,"
			+ "mem_nickname) values(mem_no_seq.nextval, ?, ?, ?)";
	
	@Override
	public void add(MembersVO members) {
		Connection con = null;
		PreparedStatement pre = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			con.setAutoCommit(false);
			
			pre = con.prepareStatement(add_members);
			pre.setString(2, members.getMem_acc());
			pre.setString(3, members.getMem_rank());
			pre.setString(3, members.getMem_nickname());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
