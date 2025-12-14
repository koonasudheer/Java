package pattern;

public class Pattern11 {

	public static void main(String[] args) {
		

		        int space = 6;
		        int star = 1;

		        // Upper part of big diamond
		        for (int i = 1; i <= 7; i++) {

		            for (int s = 1; s <= space; s++) {
		                System.out.print(" ");
		            }

		            for (int st = 1; st <= star; st++) {
		                System.out.print("* ");
		            }

		            System.out.println();

		            space--;
		            star++;
		        }

		        // Lower part of big diamond
		        space = 1;
		        star = 6;

		        for (int i = 1; i <= 6; i++) {

		            for (int s = 1; s <= space; s++) {
		                System.out.print(" ");
		            }

		            for (int st = 1; st <= star; st++) {
		                System.out.print("* ");
		            }

		            System.out.println();

		            space++;
		            star--;
		        }
		    }
		}