package assigementQuestionsPractice;

public class Upi  implements Payment{

	

	

	@Override
	public void pay() {
		System.out.println("pay the upi bill is :"+234556);
		
	}
	
        public static void main(String[] args) {
        	Payment a = new Upi();
        	a.pay();
		

	}

}
