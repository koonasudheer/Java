package Methods;

public class Moblie {
	 public static void recording() {
		 String ram = "8gb";
		 System.out.println("recording java class....");
		 System.out.println("phone ram "+ram);
		 Moblie n = new Moblie();
			n.chatting();
		 
	 }
	 
	 void chatting() {
		 String s = "Iphone";
		 System.out.println("whatapp.....");
		 System.out.println("phone name.."+s);
	 }
	public static void main(String[] args) {
		System.out.println("main method starts from here......");
		recording();
		System.out.println("main method is end here.......");
		

	}

}
