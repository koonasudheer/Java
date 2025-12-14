package pattern;

public class pattern16 {

	public static void main(String[] args) {
		int n = 1;
		for(int i = 1 ; i<=5 ; i++) {
			for(int j = 1 ; j<=5 ; j++) {
				if((i==j)||(i+j)==6) {
					System.out.print(n);
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			n++;
		

	 }

   }
}
