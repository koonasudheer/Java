package conditionsStatement;

public class PersonsAge {

	public static void main(String[] args) {
		int age = -45;
		if(age >=0 && age <=5) {
			System.out.println(" months baby ");
		}
		else if(age >=6 && age <= 10) {
			System.out.println(" just a child boy/girl ");
		}
		else if(age >= 11 && age <= 19) {
			System.out.println(" just a boy/girl");
			
		}
		else if(age >= 20 && age <= 30) {
			System.out.println(" just a man / women  ");
			
		}
		else if (age >=31 && age <= 70) {
			System.out.println("father / mother ");
		}
		else if ( age >=71 && age <=100) {
			System.out.println("grand father / grand mother ");
		}
		else {
			System.out.println("invaild age");
		}
	}

}
