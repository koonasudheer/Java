package NonPrmitiveTypeCasting;

public class Main {

	public static void main(String[] args) {
		Animal a = new Cat("chicku","white",5,"snowwhite"); // upcasting
		// a-> is a refernce variable
		System.out.println(a.toString());
		System.out.println(a.name);
		System.out.println(a.colour);
		a.eat();
		a.running();
		
		
		
		// Cat c = (cat) animal(); direct downcasting is not possible in the downcasting it will throw 
		Cat c = (Cat)a;
		System.out.println(c.toString());
		System.out.println(c.name);
		System.out.println(c.colour);
		c.eat();
		c.running();
		System.out.println(c.age);
		System.out.println(c.sound);
		c.sleep();
		c.sound();

	}

}
