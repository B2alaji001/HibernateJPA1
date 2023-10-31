package com.deeptech.hibernate.wwork2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee //user-defined class
{
	
	@Id
	@Column(name="E_empid")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
     	 private int empid;
	@Column(name="E_empname")
     	 private String empname;
	@Column(name="E_email")
   	   private String email;
	@Column(name="E_mobile")
      	private String mobilenum;
	@Column(name="E_age")
     	 private int age;
	@Column(name="E_salary")
    	  private int salary;
	@Column(name="E_state")
     	 private String state;
	
	//Generate getter and setter method
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}   
}
