package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.EmployeeD;
import com.gretlearning.service.CredServiceImpl;

public class EmailDriverMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first name");
		String fname = sc.nextLine();
		System.out.println("Enter last name");
		String lname = sc.nextLine();
		EmployeeD e1 = new EmployeeD(fname, lname);
		EmployeeD e2 = new EmployeeD();

		e2.setFirstName(fname);
		e2.setLastName(lname);

		CredServiceImpl cs = new CredServiceImpl();

		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");

		int choice = sc.nextInt();
		System.out.println("Dear " + e1.getFirstName() + " your generated credentials are as follows :");
		String genemail = "";
		String genepass = "";
		switch (choice) {
		case 1:
			genemail = cs.generateEmailId(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(), "tech",
					"abc");
			break;
		case 2:
			genemail = cs.generateEmailId(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(), "admin",
					"abc");
			break;
		case 3:
			genemail = cs.generateEmailId(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(), "HR", "abc");
			break;
		case 4:
			genemail = cs.generateEmailId(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(), "legal",
					"abc");
			break;
		default:
			System.out.println("Please enter valid choice");
		}
		genepass = cs.generatePassword();
		e1.setEmail(genemail);
		e1.setPassword(genepass);

		cs.showCredentials(e1);
        sc.close();
	}

}
