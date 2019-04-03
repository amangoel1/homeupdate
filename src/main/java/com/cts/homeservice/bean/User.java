package com.cts.homeservice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String contactNumber;
	private String pwd;
//	private String skills;
	
	@Column
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	@Column
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	@Column
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
//	@Column
//	public String getSkills() {
//		return skills;
//	}
//	public void setSkills(String skills) {
//		this.skills = skills;
//	}
//	public User(String userId, String firstName, String lastName, String email, String contactNumber, String pwd,
//			String skills) {
//		super();
//		this.userId = userId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.contactNumber = contactNumber;
//		this.pwd = pwd;
//		this.skills = skills;
//	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", contactNumber=" + contactNumber + ", pwd=" + pwd + "]";
	}




}
