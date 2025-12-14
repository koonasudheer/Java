package assignment;

public class Mdog {
	
	public static void dog(int p1,int p2,int p3) {
		System.out.println(" the frist dog details ");
		System.out.println( p1 * p2 * p3);
		
		
	}
	    public void dogs(String c1,String c2,String c3) {
	    	System.out.println("these dogs are two expensive.........");
	    	System.out.println(c1 + c2 + c3);
	    		    	
	    	
	    	
	    }
	    
	    public static void main(String[] args) {
		System.out.println("The main starts from here.........");
		dog(23000,45000,34000);
		Mdog a = new Mdog(); 
		a.dogs("bule", "red", "green");
		System.out.println("The main method end here........");
		
		}

}
