package com.coaches.dao;

import java.io.Serializable;
import java.sql.Blob;

public class CoachVO implements Serializable{
	private String coa_acc;
	private Integer mem_no;
	private String coa_psw;
	private Integer coa_sta;
	private String coa_name;
	private Integer coa_sex;
	private String coa_mail;
	private String coa_resume;
	private Blob coa_pic;
	private Integer coa_acc_sta;
	private Integer coa_pft;
	
	public CoachVO() {
		
	}
	
	public CoachVO(String coa_acc, int mem_no, String coa_psw, int coa_sta, String coa_name, int coa_sex, String coa_mail,
			String coa_resume, Blob coa_pic, int coa_acc_sta, int coa_pft) {
		super();
		this.coa_acc = coa_acc;
		this.mem_no = mem_no;
		this.coa_psw = coa_psw;
		this.coa_sta = coa_sta;
		this.coa_name = coa_name;
		this.coa_sex = coa_sex;
		this.coa_mail = coa_mail;
		this.coa_resume = coa_resume;
		this.coa_pic = coa_pic;
		this.coa_acc_sta = coa_acc_sta;
		this.coa_pft = coa_pft;
	}

	public String getCoa_acc() {
		return coa_acc;
	}
	
	public void setCoa_acc(String coa_acc) {
		this.coa_acc = coa_acc;
	}
	public int getMem_no() {
		return mem_no;
	}
	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}
	public String getCoa_psw() {
		return coa_psw;
	}
	public void setCoa_psw(String coa_psw) {
		this.coa_psw = coa_psw;
	}
	public int getCoa_sta() {
		return coa_sta;
	}
	public void setCoa_sta(int coa_sta) {
		this.coa_sta = coa_sta;
	}
	public String getCoa_name() {
		return coa_name;
	}
	public void setCoa_name(String coa_name) {
		this.coa_name = coa_name;
	}
	public int getCoa_sex() {
		return coa_sex;
	}
	public void setCoa_sex(int coa_sex) {
		this.coa_sex = coa_sex;
	}
	public String getCoa_mail() {
		return coa_mail;
	}
	public void setCoa_mail(String coa_mail) {
		this.coa_mail = coa_mail;
	}
	public String getCoa_resume() {
		return coa_resume;
	}
	public void setCoa_resume(String coa_resume) {
		this.coa_resume = coa_resume;
	}
	public Blob getCoa_pic() {
		return coa_pic;
	}
	public void setCoa_pic(Blob coa_pic) {
		this.coa_pic = coa_pic;
	}
	public int getCoa_acc_sta() {
		return coa_acc_sta;
	}
	public void setCoa_acc_sta(int coa_acc_sta) {
		this.coa_acc_sta = coa_acc_sta;
	}
	public int getCoa_pft() {
		return coa_pft;
	}
	public void setCoa_pft(int coa_pft) {
		this.coa_pft = coa_pft;
	}
	
	
}
