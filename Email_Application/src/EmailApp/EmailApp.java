package EmailApp;

import java.util.Scanner;

public class EmailApp
{
	private String firstName;
	private String lastName;
	private String domainName;
	private String password;
	private int defaultPasswordLength=10;
	private String mailAddress;
	final private String companyPrefix="Cognizant.com";
	
	private Scanner scan = new Scanner(System.in);
	
	//	constructor for EmailApp
	public EmailApp(String firstName , String lastName)
	{
		this.firstName = firstName.trim();
		this.lastName = lastName.trim();
		this.domainName = setDomainName();
		this.password = generatePassword(defaultPasswordLength);
		this.mailAddress = generateMailAddress();
		showInfo();
	}
	
	//	method for setting domainName
	public String setDomainName()
	{
		System.out.println("Domain Codes:- \n1-ADM \n2-CDE \n3-AIA \n4-QAE \n5-CDB");
		System.out.print("Enter your Domain Code : ");
		int deptCode = scan.nextInt();
		if (deptCode == 1)
		{
			return "ADM";
		}
		else if (deptCode == 2)
		{
			return "CDE";
		}
		else if (deptCode == 3)
		{
			return "AIA";
		}
		else if (deptCode == 4)
		{
			return "QAE";
		}
		else if (deptCode == 5)
		{
			return "CDB";
		}
		else
		{
			return "NA";
		}
	}
	
	//generate an Email Address for new Hires
	public String generateMailAddress()
	{
		return firstName+"."+lastName+"@"+companyPrefix;
	}
	
	//generate a random Password 
	public String generatePassword(int defaultPasswordLength)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&";
		char[] password = new char[defaultPasswordLength];
		for(int i=0 ; i<defaultPasswordLength ; i++)
		{
			int random = (int)  (Math.random() * passwordSet.length());	//(0.0-0.9  * 40)
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	
	// set method to change password
	
	// set the mailBox capacity
	
	// set alternative email address
	
	// showInfor method for displaying the name,email,mailBoxcapacity 
	public void showInfo()
	{
		System.out.println("Full Name : "+firstName+" "+lastName);
		System.out.println("Domain Name : "+domainName);
		System.out.println("Mail Id : "+mailAddress);
		System.out.println("One-Time Password : "+password);
		
	}
	
}
