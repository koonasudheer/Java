package pattern;

public class pattern14 {

	public static void main(String[] args) {
		int space = 4;
		int value = 1;
		char ch = 'a';
		for(int i = 1;i<=5;i++) {
			for(int j = 1 ;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k =1;k<=value;k++) {
				System.out.print(ch);
			}
			System.out.println();
			space--;
			value+=2;
			ch++;
		}
		

	}

}
