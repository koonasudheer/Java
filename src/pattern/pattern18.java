package pattern;

public class pattern18 {

	public static void main(String[] args) {
		int n = 5;
		int value = 1;
		for(int i = 1; i<=9;i++) {
			for(int j = 1;j<=value;j++) {
				System.out.print(n);
			}
			System.out.println();
			if(i<=4){
				value++;
				n--;
			}
			else {
				value--;
				n++;
			}
		}

	}

}
