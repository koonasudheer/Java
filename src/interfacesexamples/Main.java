package interfacesexamples;

public class Main {

	public static void main(String[] args) {
		Dell d = new Dell("16gb","white");
		System.out.println(d.toString());
		System.out.println(Laptop.name);
		Laptop.recording();
		d.sending();
		d.chatting();
		d.calling();
		
		d.gaming();
		System.out.println(d.colour);
		System.out.println(d.Stroage);

	}

}
