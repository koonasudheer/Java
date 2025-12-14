package abstractclass;

public abstract class Moblie {
	String name;
	int ram;
	public Moblie(String name, int ram) {
		super();
		this.name = name;
		this.ram = ram;
	}
	
	public abstract void recording();
	
	public static void chatting() {
		System.out.println("chatting in phone........");
	}
	public void calling() {
		System.out.println("calling in phone...........");
	}
	

}
