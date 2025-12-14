package pattern;

public class Pattern15 {

	public static void main(String[] args) {
		int space = 0;
		int value = 9;
		char ch = 'e';
		for(int i = 1;i<=5;i++) {
			for(int k =1;k<=space;k++) {
				System.out.print(" ");
			
			}
			for(int j = 1 ;j<=value;j++) {
				System.out.print(ch);
			
			}
			System.out.println();
			space++;
			value-=2;
			ch--;
		}

	}

}
