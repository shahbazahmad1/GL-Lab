package com.greatlearning.service;
import com.greatlearning.model.Employee;

interface CredentialService 
{
	public char[] generatePassword();
	public String generateEmailAddress(String firstName,String lastName,String Department);
	public void showCredentials(Employee emp,String email);
}
