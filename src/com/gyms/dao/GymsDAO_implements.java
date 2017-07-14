package com.gyms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class GymsDAO_implements implements GymsDAO_interface{

	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "SERVLET_XIANGZHI";
	private static final String password = "0958771608";
	private static final String add_gyms = "";
	private static final String add_members = "Insert into members values(mem_no_seq)";
	private static final String update = "update coaches ";
	private static final String login = "";
	
	Connection con = null;
	PreparedStatement pre = null;
	
	@Override
	public void add(GymsVO gyms) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(GymsVO gyms) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GymsVO gyms) {
		// TODO Auto-generated method stub
		
	}

}
