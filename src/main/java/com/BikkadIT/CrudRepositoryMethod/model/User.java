package com.BikkadIT.CrudRepositoryMethod.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USER_DETAILS")         //for creation table
public class User {
	
    @Id                  //for primary key creation,for Auto-Generate we used generation
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String userAddress;
	private int userAge;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", userAge="
				+ userAge + "]";
	}
	
	
	
	
	
}
