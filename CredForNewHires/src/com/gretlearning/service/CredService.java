package com.gretlearning.service;

import com.greatlearning.model.EmployeeD;

public interface CredService {
	String generateEmailId(String firstName,String lastName,String depart,String company);
    String generatePassword();
    void showCredentials(EmployeeD e1);

}
