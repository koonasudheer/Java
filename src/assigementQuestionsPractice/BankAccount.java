package assigementQuestionsPractice;

public class BankAccount {
	private long accountNumber;
	private String holderName;
	private int balance;
	public long getAccountNumber() {
		return 30214569872L ;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getHolderName() {
		return "sudheer";
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public int getBalance() {
		return 2000000;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit() {
		System.out.println("amount is deposite here .....");
	}
	
	public int withdraw() {
		return 230000;
	}
	

	
}
