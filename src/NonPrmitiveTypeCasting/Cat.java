package NonPrmitiveTypeCasting;

public class Cat extends Animal{
	int age;
	String sound;
	public Cat(String name, String colour, int age, String sound) {
		super(name, colour);
		this.age = age;
		this.sound = sound;
	}
	public static void sound() {
		System.out.println("meow meow ,meow");
	}
	public void sleep() {
		System.out.println("cat is sleeping");
	}

}
