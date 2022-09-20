package com.greatlearning.service;
import java.util.Random;
import com.greatlearning.model.Employee;

public class credentialServiceImpl implements CredentialService
{


	
	public char[] generatePassword() 
	{
		  String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$%&*";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[8];

	      
	      for(int i = 0; i < 8 ; i++) 
	      {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
	}

	
	public String generateEmailAddress(String firstName, String lastName, String Department)
	{
		
		return firstName+lastName+"@"+Department+".abc.com";
	}

	
	public void showCredentials(Employee emp, String email) 
	{
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows ");
		System.out.println("EMAIL----> "+email);
		System.out.print("PASSWORD-> ");
		System.out.println(generatePassword());
		
	}	
}
