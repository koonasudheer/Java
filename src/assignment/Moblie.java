package assignment;

public class Moblie {
	String name;
	String model;
	int gb;
	int pixel;
	
	 Moblie(String name,String model,int gb,int pixel) {
		this.name = name;
		this.model= model;
		this.gb = gb;
		this.pixel = pixel;
		
	}
	

	public static void main(String[] args) {
		Moblie ss = new Moblie("apple","pro",128,60);
		System.out.println("mobliename is: "+ss.name+" , mobliemodel is: "+ss.model+" , gb is: "+ss.gb+" , pixel is : "+ss.pixel);
		
		
		Moblie sm = new Moblie("android","one plus",128,40);
		System.out.println("mobliename is: "+sm.name+" , mobliemodel is: "+sm.model+" , gb is: "+sm.gb+" , pixel is : "+sm.pixel);
		
		Moblie sa = new Moblie("basic model","keypad",4,30);
		System.out.println("mobliename is: "+sa.name+" , mobliemodel is: "+sa.model+" , gb is: "+sa.gb+" , pixel is : "+sa.pixel);
		

	}

}
