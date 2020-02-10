package com.example.demo.model;

public class RegisterUserRequest {
	
	private String userId;
	private String fistName;
	private String lastName;
	private String address;
	private String password;

	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "RegisterUserRequest [userId=" + userId + ", fistName=" + fistName + ", lastName=" + lastName
				+ ", address=" + address + ", password=" + password + "]";
	}
	

}
