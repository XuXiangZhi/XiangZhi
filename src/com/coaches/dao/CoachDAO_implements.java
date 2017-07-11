package com.coaches.dao;

import java.sql.*;

public class CoachDAO_implements implements CoachDAO_interface {

	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "SERVLET_XIANGZHI";
	private static final String password = "0958771608";
	private static final String add = "Insert into coach(coa_acc, coa_psw, coa_name, coa_sex, coa_mail, coa_resume, coa_pic, coa_pft)"
			+ "values (?,?,?,?,?,?,?,?)";
	private static final String seq = "Insert into members values(mem_no_seq)";
	private static final String update = "UPDATE COACH SET coa_psw=?, coa_name=?, coa_sex=?, coa_mail=? where coa_acc=?";
	private static final String login = "select * from coach where coa_acc =  ?";
	
	Connection con = null;
	PreparedStatement pre = null;
	
	@Override
	public void add(CoachVO coach) {	
		try {
			Class.forName(driver);
			con  = DriverManager.getConnection(url, user, password);
			pre = con.prepareStatement(add);
			pre.setString(1, coach.getCoa_acc());
			pre.setString(2, coach.getCoa_psw());
			pre.setString(3, coach.getCoa_name());
			pre.setInt(4, coach.getCoa_sex());
			pre.setString(5, coach.getCoa_mail());
			pre.setString(6, coach.getCoa_resume());
			pre.setBlob(7, coach.getCoa_pic());
			pre.setInt(8, coach.getCoa_pft());
			
			System.out.println(pre);
			pre.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(pre != null) {
				try {
					pre.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public void update(CoachVO coach) {	
		try {
			Class.forName(driver);
			con  = DriverManager.getConnection(url, user, password);
			pre = con.prepareStatement(update);
//			pre.setString(1, coach.getCoa_psw());
//			pre.setString(2, coach.getCoa_name());
//			pre.setInt(3, coach.getCoa_sex());
//			pre.setString(4, coach.getCoa_mail());
//			pre.setString(5, coach.getCoa_acc());
//			
//			pre.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(pre != null) {
				try {
					pre.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void login(CoachVO coach) {
		try{
			Class.forName(driver);
			con  = DriverManager.getConnection(url, user, password);
			pre = con.prepareStatement(login);
			pre.setString(1, coach.getCoa_acc());
			ResultSet rs = pre.executeQuery();
		
			rs.next();
			String acc = rs.getString("coa_acc");
			String psw = rs.getString("coa_psw");
			String name = rs.getString("coa_name");
			int sex = rs.getInt("coa_sex");
			String mail = rs.getString("coa_mail");
			String resume = rs.getString("coa_resume");
			Blob pic = rs.getBlob("coa_pic");
			int pft = rs.getInt("coa_pft");
			
			System.out.println(acc + psw);
			if(psw.equals(coach.getCoa_psw()) && acc.equals(coach.getCoa_acc())) {
				System.out.println("登入成功");
				System.out.println(acc + psw + name + sex + mail + resume + pic +pft);
				return;
			}else {
				System.out.println("登入失敗");
				return;
			}	
		} catch(Exception e) {
			
		}
	}

	

}
