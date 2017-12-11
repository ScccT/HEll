package com.erHigh.bean;

public class User {
	private int userId; 
	private String userAccount ;
	private String userPwd ;
	private int  userStatus;
	public User() {
		
	}
	public User(int userId, String userAccount, String userPwd, int userStatus) {
		this.userId = userId;
		this.userAccount = userAccount;
		this.userPwd = userPwd;
		this.userStatus = userStatus;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userAccount=" + userAccount + ", userPwd=" + userPwd + ", userStatus="
				+ userStatus + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	} 
	
	
}
