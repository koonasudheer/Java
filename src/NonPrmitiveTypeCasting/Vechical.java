package NonPrmitiveTypeCasting;

public abstract class Vechical {
	String name;
	String Colour;
	public Vechical(String name, String colour) {
		super();
		this.name = name;
		this.Colour = colour;
	}
	public abstract void driving();
	
	public static void clean() {
		System.out.println("car is clean......");
	}
	public void tires() {
		System.out.println("tires was repired.......");
	}
	

}
