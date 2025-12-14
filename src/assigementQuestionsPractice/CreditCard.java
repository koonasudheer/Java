package assigementQuestionsPractice;

public class CreditCard implements Payment {

	@Override
	public void pay() {
		System.out.println("This is CreditCard Payment Process.....");
		
	}
	public static void main(String[] args) {
		Payment p=new CreditCard();
		p.pay();
	}

	

}
