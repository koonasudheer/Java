package interfacesexamples;

public class Labardor extends Animal implements Dog,PetDog {
	String colour;

	public Labardor(String name, int born, int weight, String colour) {
		super(name, born, weight);
		this.colour = colour;
	}

	@Override
	public void running() {
		System.out.println("animal is running........");
		
	}

	@Override
	public void Shouting() {
		System.out.println("animal is shouting.......");
		
	}

	@Override
	public void bathing() {
		System.out.println("animal is bathing");
		
	}
	
	
	


	

}
