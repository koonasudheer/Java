package loops;

public class PalindromeOrNot {

	public static void main(String[] args) {
		int n = 12621;
		int temp = n;
		int rev =0;
		while(n>0) {
			int r = n%10; // extraction
			rev=(rev*10)+r; // reversing a number 
			n=n/10;  // elimination 
		}
		System.out.println("reverse number "+ rev);
		if(temp == rev) {
			System.out.println(temp+" is a palindorme number");
			}
		else {
			System.out.println(temp+" is not a plaindorme number");
		}


	}

}
