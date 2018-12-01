package com.shrey.microservices.pojo;

public class User {

	private String firstName = "", LastName = "";

	public User(String firstName, String lastName) {
		this.firstName = firstName;
		LastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return LastName;
	}

}
