package com.xworkz.dto;

public class ServiceDto {
	String name;
	String email;
	String password;
	String confirmpassword;

	public ServiceDto(String name, String email, String password, String confirmpassword) {
		super();
		
		
		this.name = name;
		this.email = email;
		this.password = password;
		this.confirmpassword = confirmpassword;

	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirmpasssword() {
		return confirmpassword;
	}

}
