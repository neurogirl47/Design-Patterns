package com.caveofprogramming.designpatterns.demo1.model;

public class Person {

	private String name;
	private String password;
	
	public Person(){
		
	}
	
	public Person(String name, String password){
		this.name = name;
		this.password = password;
	}

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
	
}