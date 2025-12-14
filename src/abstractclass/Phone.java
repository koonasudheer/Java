package abstractclass;

public class Phone extends Moblie {
	String colour;

	public Phone(String name, int ram, String colour) {
		super(name, ram);
		this.colour = colour;
	}
	public void recording() {
		System.out.println(" Class is recording......");
	}
	public static void camera() {
		System.out.println("Taking the photo in camera.....");
	}
	public static void main(String[] args) {
		Phone i = new Phone("iphone",64,"white");
		System.out.println(i.toString());
	    System.out.println(i.name);
	    System.out.println(i.ram);
	    i.recording();
	    i.calling();
	    System.out.println(i.colour);
	    i.camera();
	}

}
