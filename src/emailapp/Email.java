 package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int defaultPasswordLength=10;
	private int mailboxCapacity=500;
	private String alternateEmail;
	private String companySuffix="stcompany.com";
	
	//	Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	// call a method asking for the department - return the depertment 
	this.department=setDepartment();

	
	//Call a method that returns random password 
	this.password=randomPassword(defaultPasswordLength);
	System.out.print("your password is:"+this.password );
	
	//Combine elements to generate email
	email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
	
	}
	//Ask for the department
	private String setDepartment() {
		System.out.print("New worker:" +firstName+" "+lastName+"\nDepartment Codes\n1 for sales\n2 for Development\n3 for Acounting\n0 for none");
		System.out.println("\nEnter depertment code:");
		Scanner in=new Scanner(System.in);//sayı girip seçim yapılma
		int depChoice = in.nextInt();
		if(depChoice==1) {return "sales";}
		else if (depChoice==2) {return "dev";}
		else if(depChoice==3) {return "acct";}
		else {return "";}
		
		
		}
		
	
	// generate a random password 
	private String randomPassword(int length) {
		String passwordSet="ABCDEFCGHIJKLMNOPQRSTUWXYZ0123456789!#@$";
		char[] password = new char[length];
		for (int i=0; i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
			
		}
		return new String(password);		
	}
	
	//Set the mailbox capacity
public void setMailBoxCapacity(int capacity) {
	this.mailboxCapacity=capacity;
}
//set the alternative email
public void setAlternativeEmail(String altEmail) {
	this.alternateEmail=altEmail;
}
//change the password
public void  changePassword(String password) {
	this.password=password;
	
}
public int getMailboxCapacity() {return mailboxCapacity;}
public String setAlternativeEmail() {return alternateEmail;}
public String changePassword() {return password;}


public String showInfo() {
	return "\nDISPLAY NAME:" + firstName+" "+lastName+" "+"\nCOMPANY EMAIL"+" "+email+"\nMAILBOX CAPASITY:"+" "+ mailboxCapacity+"mb";
}
	

	
}
	

	

