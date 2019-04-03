package com.cts.homeservice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Admin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int adminId;
	private String firstName;
	private String lastName;
	private String email;
	private String pwd;
	private String contactNumber;
	
	@Column
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Column
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
//	public Admin(String adminId, String firstName, String lastName, String email, String pswd, String contactNumber) {
//		super();
//		this.adminId = adminId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.pwd = pwd;
//		this.contactNumber = contactNumber;
//	}
	public Admin() {
		super();
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", pwd=" + pwd + ", contactNumber=" + contactNumber + "]";
	}
	
	
	

}
