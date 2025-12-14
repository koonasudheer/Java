package Methods;

public class Operations {
	
	public static int addition(int a,int b,int c) {
		System.out.println("Addition is.....");
		return a+b+c;
	}
	
	public String concatenation(String s,float f,long l) {
		System.out.println("concatenation is ....");
		return s+f+l;
	
	}

	public static void main(String[] args) {
        System.out.println("main method is starts from here.......");
		
		System.out.println(addition(21,45,36));
		Operations op = new Operations();
		System.out.println(op.concatenation("xyz", 13.5F, 34L));
		
		System.out.println("main method ends from here .......");
		
		

	}

}
