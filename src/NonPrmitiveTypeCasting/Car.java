package NonPrmitiveTypeCasting;

public class Car extends Vechical{
	int prize;

	public Car(String name, String colour, int prize) {
		super(name, colour);
		this.prize = prize;
	}
	public void driving() {
		System.out.println("Car is driving on the road ");
	}
	public static void cleaning() {
		System.out.println("car is cleaning.....");
	}

}
