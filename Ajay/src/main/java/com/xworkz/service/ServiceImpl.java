package com.xworkz.service;

import com.xworkz.dto.ServiceDto;

public class ServiceImpl implements Service {

	@Override
	public boolean valid(ServiceDto serviceDto) {
		// TODO Auto-generated method stub
		boolean valid =true;
		if(serviceDto!=null) {
			System.out.println("serviceDto is not null");
			String name = serviceDto.getName();
			if (name != null && name.length() > 2 && name.length() < 30)
				System.out.println("name is valid");


		else {
			System.err.println("name not valid");
			valid = false;
		}

		String email = serviceDto.getEmail();
		if (email != null && email.contains("@") && (email.endsWith(".com") || email.endsWith(".in"))) {
			System.out.println("Email is valid");
		} else {
			System.out.println("Email is not vallid");
			valid = false;
		}
		String password=serviceDto.getPassword();
		if( password!=null && !password.isEmpty()) {
			System.out.println("password is valid");
		}
		else {
			System.out.println("password is not valid");
			valid = false;
		
		}
		
		String conformPassword=serviceDto.getConfirmpasssword();
		
		if( conformPassword!=null && !conformPassword.isEmpty()) {
			System.out.println("conformPassword is valid");
		}
		else {
			System.out.println("conformPassword is not valid");
			valid = false;
		
		}
		
		if(!conformPassword.equals(password)) {
			valid=false;
		}
	}
	 return valid;

}

}