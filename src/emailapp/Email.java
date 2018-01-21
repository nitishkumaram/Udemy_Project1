package emailapp;

import java.util.Scanner;

public class Email {
	
	//
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "accenture.com";
	private int defaultPasswordLength = 8;
	
	//Constructor to receive the first and last name
	
	public Email(String firstName, String lastName){
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		
		//call a method asking for the department - return the department
		this.department = setDepartment();

		//Call a method that return a random password
			this.password = randomPassword(defaultPasswordLength);
			System.out.println("Your password is: "+ this.password);
			
		//Combine element to generate email
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
	
	//Ask for department
	
	private String setDepartment(){
		System.out.println("DEPARTMENT CODE: \n1 for Sales \n2 for development \n3 for Accounting\n0 for none\n Enter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1){ return "Sales"; }
		else if(depChoice == 2){ return "dev"; }
		else if(depChoice == 3){ return "acct"; }
		else return "";
	}
	
	//Generate a random password
	
	private String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++){
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	//Set mailbox capacity
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Set and alternate email
	
	public void setAlternateEmail(String altEmail){
		this.alternateEmail = altEmail;
	}
	
	//Change the password

	public void changePassword(String password){
		this.password = password;
	}
	
	public int getMailboxCapacity(){
		return mailboxCapacity;
	}
	
	public String getAlternateEmail(){
		return alternateEmail;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String showInfo(){
		return "\nDISPLAY NAME: " + firstName + " "+ lastName + 
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "MB";
	}
	
}
