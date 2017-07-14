package com.gyms.dao;

import java.io.Serializable;

import oracle.sql.BLOB;

public class GymsVO implements Serializable{
	private String gym_acc;
	private Integer mem_no;
	private Integer gym_sta;
	private String gym_name;
	private String gym_mail;
	private String gym_add;
	private String gym_into;
	private byte[] gym_pic;
	
	public GymsVO() {
		
	}

	public String getGym_acc() {
		return gym_acc;
	}

	public void setGym_acc(String gym_acc) {
		this.gym_acc = gym_acc;
	}

	public Integer getMem_no() {
		return mem_no;
	}

	public void setMem_no(Integer mem_no) {
		this.mem_no = mem_no;
	}

	public Integer getGym_sta() {
		return gym_sta;
	}

	public void setGym_sta(Integer gym_sta) {
		this.gym_sta = gym_sta;
	}

	public String getGym_name() {
		return gym_name;
	}

	public void setGym_name(String gym_name) {
		this.gym_name = gym_name;
	}

	public String getGym_mail() {
		return gym_mail;
	}

	public void setGym_mail(String gym_mail) {
		this.gym_mail = gym_mail;
	}

	public String getGym_add() {
		return gym_add;
	}

	public void setGym_add(String gym_add) {
		this.gym_add = gym_add;
	}

	public String getGym_into() {
		return gym_into;
	}

	public void setGym_into(String gym_into) {
		this.gym_into = gym_into;
	}

	public byte[] getGym_pic() {
		return gym_pic;
	}

	public void setGym_pic(byte[] gym_pic) {
		this.gym_pic = gym_pic;
	}

	

}
