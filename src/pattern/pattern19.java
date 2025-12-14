package pattern;

public class pattern19 {

	public static void main(String[] args) {
		for(int i =1 ; i<=9;i++) {
			for(int j = 1; j<=9; j++) {
				if(((i+j)==6)|| ((i-j)==4)) {
					System.out.print("*");
				}
				else if(((i==2)||i==8)&&j==6) {
					System.out.print("*");
				}
				else if(((i==3)||i==7)&&j==7) {
					System.out.print("*");
				}
				else if(((i==4)||i==6)&&j==8) {
					System.out.print("*");
				}
				else if ((i==5)&&j==9) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
		}

	}

}
