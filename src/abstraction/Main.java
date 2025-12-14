package abstraction;

public class Main {

	public static void main(String[] args) {
		
		Bank a = new Bank();
		Atm s = a.Atm();
		System.out.println(s.withdraw());
		System.out.println(s.checkblance());
		System.out.println(s.savemoney());
		
		
		

	}

}
