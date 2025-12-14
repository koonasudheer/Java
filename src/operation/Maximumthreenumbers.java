package operation;

public class Maximumthreenumbers {

	public static void main(String[] args) {
		int a = 780;
		int b = 4500;
		int c = 7345;
		int d = (a>b) ? a : b ;
		int max = (d>c) ? d:c;
		System.out.println(max + "is a maximum " );
		
		
		int zam = (a>b)? ((a>c)?a:b):((b>c)?b:c);
		System.out.println(zam+"is a maxmium number ");

	}

}
