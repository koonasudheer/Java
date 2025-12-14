package pattern;

public class NumberPattern {

	public static void main(String[] args) {
		int space = 4;
		int value = 1;
		int n = 5;
		for(int i = 1; i<=5; i++) {
			for(int j = 1;j<=space;j++) {
				System.out.print(" ");
		}
			for(int m = 1;m<=value;m++) {
				System.out.print(n);
		}
			System.out.println();
			space--;
			value+=2;
			n--;
			
		}
		
		

	}

}
