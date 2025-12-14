package WhileQuestions;

public class palindromeOrNot {

	public static void main(String[] args) {
		int a = 12321;
		int temp = a;
		int rev = 0;
		while(a>0) {
			int r = a % 10 ; // Extration
			rev = (rev*10)+r;
			a = a/10;
		}
		System.out.println( rev + " is the reverse number ");
		if(temp == rev ) {
			System.out.println( temp+ " is a palindrome ");
		}
		else {
			System.out.println(temp + "is not a pladorme");
		}

	}

}
