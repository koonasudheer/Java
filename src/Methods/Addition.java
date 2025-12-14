package Methods;

public class Addition {
	
	public void concatenation(String s,float f,long l) {
		System.out.println("concatenation is ....");
		System.out.println(s+f+l);
	
	}
	
	public static void main(String[] args) {
		System.out.println("main method is starts from here.......");
		
		addition(21,45,36);
		Addition n = new Addition();
		n.concatenation("xyz", 13.5F, 34L);
		
		System.out.println("main method ends from here .......");
		
		
	}
	public static void addition(int a,int b,int c) {
		System.out.println("Addition is.....");
		System.out.println(a+b+c);
	}

}
