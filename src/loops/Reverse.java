package loops;

public class Reverse {

	public static void main(String[] args) {
		int n = 134567;
		int rev =0;
		while(n>0) {
			int r = n%10; // extraction 
			rev=(rev*10)+r; // reversing a number 
			n=n/10;  // elimination 
		}
		System.out.println("reverse number "+ rev);

	}

}
