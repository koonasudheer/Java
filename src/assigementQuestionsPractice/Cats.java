package assigementQuestionsPractice;

public class Cats extends Animals {
	String colour;

	public Cats(String name, int prize, String colour) {
		super(name, prize);
		this.colour = colour;
	}
	
	public void colour() {
		System.out.println("cat is in brown colour.......");
	}
	
	public static void main(String[] args) {
		Animals a = new Cats("meow",50332,"brown");
		System.out.println(a.toString());
		System.out.println("name of the animla is :" + a.name +"  price of the animal is:"+ a.prize);
		a.sound();
		System.out.println(a.sleep());
		
		Cats c = (Cats)a;
		System.out.println(c.toString());
		System.out.println(c.name);
		System.out.println(c.prize);
		System.out.println(c.colour);
		c.sound();
		System.out.println(c.sleep());
		c.colour();
		
	}

}
