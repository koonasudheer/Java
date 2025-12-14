package interfacesexamples;

public class Dell implements Laptop {
	String Stroage;
	String colour;
	
	
	public Dell(String stroage, String colour) {
		super();
		Stroage = stroage;
		this.colour = colour;
	}


	@Override
	public void sending() {
	System.out.println("sending the message");
		
	}


	@Override
	public void chatting() {
		System.out.println("chatting with a person.....");
		
	} 
	
	public void gaming() {
		System.out.println("playing in laptop");
	}

	
}
