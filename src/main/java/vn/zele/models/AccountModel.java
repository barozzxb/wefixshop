package vn.zele.models;

import java.io.Serializable;
import java.sql.Date;

public class AccountModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String userid;
	private String password;
	private String name;
	private Date dob;
	private String gender;
	private String email;
	private String phonenum;
	private String address;
	private boolean isDeactivated;
	private int role;
	
	public AccountModel() {
		super();
	}
	
	//For register new account
	public AccountModel(String userid, String password, String email) {
		super();
		this.userid = userid;
		this.password = password;
		this.email = email;
	}
	
	//For getting information view/ profile
	public AccountModel(String userid, String password, String name, Date dob, String gender, String email,
			String phonenum, String address, boolean isDeactivated, int role) {
		super();
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.phonenum = phonenum;
		this.address = address;
		this.isDeactivated = isDeactivated;
		this.role = role;
	}

	//For Login
	public AccountModel(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isDeactivated() {
		return isDeactivated;
	}

	public void setDeactivated(boolean isDeactivated) {
		this.isDeactivated = isDeactivated;
	}

	@Override
	public String toString() {
		return "AccountModel [userid=" + userid + ", password=" + password + ", name=" + name + ", dob=" + dob
				+ ", gender=" + gender + ", email=" + email + ", phonenum=" + phonenum + ", address=" + address
				+ ", isDeactivated=" + isDeactivated + ", role=" + role + "]";
	}

}
