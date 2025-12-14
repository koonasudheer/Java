package Exam;

public class Operators {

	public static void main(String[] args) {
		int a = 19;
		int b =  a-- + a++ + a-- + ++a + a-- + --a + ++a - a-- ;
		int c = b++ + --a + b-- + ++a + ++b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
