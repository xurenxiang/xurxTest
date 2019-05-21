package com.xu.spring.bean;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String userName;
	private String password;
	private int age;
	private String email;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password
				+ ", age=" + age + ", email=" + email + "]";
	}
	
	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		List<String> b = a;
		b.remove(2);
		System.out.println(a);
		System.out.println(b);
	}
	
	
}
