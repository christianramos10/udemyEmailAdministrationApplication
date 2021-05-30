import java.util.Scanner;

public class Email {

	//Variables for each user
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity=500;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	
	//Constructor to receive first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println("Subject: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for department
		this.department = setDepartment();
//		System.out.println("Department: " + this.department);
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+ this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
//		System.out.println("Your Email: " + email);
	}
	

	//Ask for department
	private String setDepartment() {
		System.out.print("Enter department code:\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Code: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice == 1) {return "sales";}
		else if(deptChoice==2) {return "dev";}
		else if(deptChoice==3) {return "acct";}
		else {return "none";}
		
	}
	
	//Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String (password);
	}
	
	//Setters and getters
	
	//Set mailbox capacity
	public void setMailBoxCapacity(int capacity){
		this.mailboxCapacity = capacity;
	}
	
	//Set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName + 
				"\nCompany Email: " + email + 
				"\nMailbox Capacity: " + mailboxCapacity + "mb";
				
	}
	
	
	
	
	
	
	
	
	
}
