package assigementQuestionsPractice;

public class Main {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.setAccountNumber(876543210);
		System.out.println(b.getAccountNumber());
		
		b.setHolderName("sudheer");
		System.out.println(b.getHolderName());
		
		b.setBalance(200000000);
		System.out.println(b.getBalance());
		
		b.deposit();
		System.out.println(b.withdraw());
		

	}

}
