package assignment;

public class Bank {
	String holderName;
	static String bankname = "hdfc";
	long bankaccountNumber;
	static String place = "peapully";
	char gender;
	int accountbal;
	 
	Bank(String holderName,long bankaccountnumber,char gender,int accountbal ){
		this.holderName=holderName;
		this.bankaccountNumber=bankaccountnumber;
		this.gender=gender;
	    this.accountbal=accountbal;
	    
	}

	public static void main(String[] args) {
		Bank ps1 = new Bank("anu",41178964123L,'f',450000);
		System.out.println("bank accountholdername:"+ps1.holderName+" bankaccountnumber is :"+ps1.bankaccountNumber+" gender is :"+ps1.gender+" Account bal is:"+ps1.accountbal+" bank name is :"+bankname+" bank place is:"+place);
		
		Bank ps2 = new Bank("sahana",61477953143L,'f',950000);
		System.out.println("bank accountholdername:"+ps2.holderName+" bankaccountnumber is :"+ps2.bankaccountNumber+" gender is :"+ps2.gender+" Account bal is:"+ps2.accountbal+" bank name is :"+bankname+" bank place is:"+place);


	}

}
