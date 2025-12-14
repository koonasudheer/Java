package loops;

public class Extration {

	public static void main(String[] args) {
		int n = 987642; // 98764 , 9876 , 987 , 98 
		while(n>0) { // 987642>0 , 98764>0 , 9876 >0 , 987>0,
			int r = n %10; // 987642 % 10 = 2 , 98764 % 10 = 4 , 9876 % 10 = 6 , 987%10 = 7,
			System.out.println(r);
			n = n/10; // 987642/10 = 98764.2= 98764 , 98764 / 10 = 9876.4 = 9876 , 9876 / 10 = 987.6 = 987 , 987/10 = 98.7 = 98 
			
		}

	}

}
