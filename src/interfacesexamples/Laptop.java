package interfacesexamples;

public interface Laptop {
	static String name = "hp";
	
	public void sending();
	public void chatting();
	
	public static void recording() {
		System.out.println("recording the java class..........");
	}
		
		public default void calling() {
			System.out.println("calling to a person");
		
	}

}
