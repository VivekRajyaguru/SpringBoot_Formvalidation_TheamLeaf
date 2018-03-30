package com.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class User {

	@NotNull
	@Size(min=3, max=30)
	private String name;
	
	@NotNull
	@Size(min=6, max=8)
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
	
	
}
