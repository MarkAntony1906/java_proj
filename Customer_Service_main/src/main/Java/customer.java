package com.tns.CustomerService;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class user 
{

	private Integer user_Id;
	private String user_Name;
	private Integer Ph_Number;
	private Integer Pwd;

	
	public user() 
	{
		super();
	}
	
	public user(Integer user_Id, String user_Name, Integer ph_Number, Integer pwd) 
	{
		super();
		Admin_Id = user_Id;
		user_Name = user_Name;
		Ph_Number = ph_Number;
		Pwd = pwd;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	public Integer getuser_Id() {
		return user_Id;
	}
	public void setuser_Id(Integer user_Id) {
		user_Id = user_Id;
	}
	
	public String getuser_Name() {
		return user_Name;
	}
	public void setuser_Name(String user_Name) {
		user_Name = user_Name;
	}
	public Integer getPh_Number() {
		return Ph_Number;
	}
	public void setPh_Number(Integer ph_Number) {
		Ph_Number = ph_Number;
	}
	public Integer getPwd() {
		return Pwd;
	}
	public void setPwd(Integer pwd) {
		Pwd = pwd;
	}
	@Override
	
	public String toString()
	{
		return "user[user id:"+user_Id+"user Name"+user_Name+"Phone Number"+Ph_Number+"Password"+Pwd+"]";
	}
}

