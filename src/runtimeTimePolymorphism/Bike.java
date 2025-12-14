package runtimeTimePolymorphism;

public class Bike extends vehicle{
	public String moving() {
		return "bike is moving....";
	}

	public static void main(String[] args) {
		Bike b = new Bike();
		System.out.println(b.moving());
		
		

	}

}
