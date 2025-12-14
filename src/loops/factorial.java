package loops;

public class factorial {

	public static void main(String[] args) {
		int factorial = 1;
		int n = 10;
		while(n>=1) {
			factorial = factorial*n;
			n--;
		}
		System.out.println(factorial);

	}

}
