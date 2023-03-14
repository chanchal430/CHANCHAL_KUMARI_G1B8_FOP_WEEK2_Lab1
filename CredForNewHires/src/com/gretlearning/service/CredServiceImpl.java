package com.gretlearning.service;
import java.util.Random;

import com.greatlearning.model.EmployeeD;

public class CredServiceImpl implements CredService {

	@Override
	public String generateEmailId(String firstName, String lastName, String depart, String company) {
		 
		return firstName+lastName+"@"+depart+"."+company+".com";
	}

	@Override
	public String generatePassword() {
		
	    String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String nums="0123456789";
		String splchars ="!@#$%^&*()-+";
		
		String combined = caps +lower+nums+splchars;
		String mypass = "";
		
		Random random = new Random();
		
		for(int i =0;i<8;i++) {
			mypass = mypass+ String.valueOf(combined.charAt(random.nextInt(combined.length())));
			}
		return mypass;
	}

	@Override
	public void showCredentials(EmployeeD e1) {
		
		System.out.println("Email : "+e1.getEmail());
		System.out.println("Password : "+e1.getPassword());
		
	}

	
       
}
