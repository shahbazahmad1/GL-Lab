package com.greatlearning.test;
import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.credentialServiceImpl;

public class employeeTest 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee("Shahbaz", "Ahmad");
		credentialServiceImpl cs = new credentialServiceImpl();
        String generatedEmailString;
		
		System.out.println("Select your department:");
		System.out.println("=======================");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		System.out.println("========================");
		System.out.println("Enter your choice (1-4): ");
		
		int option = sc.nextInt();
		String deptName = "gen";
		switch(option)
		{
		case 1:
			deptName = "tech";
			break;
		case 2:
			deptName = "adm";
			break;
	    case 3:
			deptName = "hr";
			break;
		case 4:
			deptName = "legal";
			break;
			
	    default:
				System.out.println("INVALID OPTION!!!!");
				System.exit(0);
				break;
		}
		
		generatedEmailString = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), deptName.toLowerCase());
	    cs.showCredentials(employee, generatedEmailString);
		sc.close();
	}

}
