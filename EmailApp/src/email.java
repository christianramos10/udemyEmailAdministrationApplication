import java.util.Scanner;

public class email {

	//Variables for each user
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	
	//Constructor to receive first name and last name
	public email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		
		//Testing constructor
		//System.out.println("Email created: " +this.firstName + " " +this.lastName);
		
		
		//Call a method asking for department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
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
	
	//Set mailbox capacity
	
	//Set alternate email
	
	//Change password
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
