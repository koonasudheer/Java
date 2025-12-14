package conditionsStatement;

public class AgeIsLimit {

	public static void main(String[] args) {
		int age = 45;
		
		if((age>=0) && (age<=100)) {
			System.out.println("person is age valid");
		}
		else {
			System.out.println("person age is not valid");
		}
	}

}
