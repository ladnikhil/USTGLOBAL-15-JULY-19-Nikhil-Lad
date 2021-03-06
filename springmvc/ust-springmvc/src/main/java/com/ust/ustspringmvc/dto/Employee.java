package com.ust.ustspringmvc.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_info")
public class Employee {
	
	@Id
	@Column 
	@GeneratedValue
	private Integer id;
	@Column(nullable = false)
	private String name;
	@Column(unique = true,nullable = false,updatable = false)
	private String email;
	@Column
	private String password;
	@Column
	private Date dob;
	
	

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * @Override public String toString() { return "Employee [id=" + id + ", name="
	 * + name + ", email=" + email + ", password=" + password + "]"; }
	 */
	
	

}
