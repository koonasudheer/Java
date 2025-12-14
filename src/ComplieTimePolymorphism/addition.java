package ComplieTimePolymorphism;

public class addition {

	public static void main(String[] args) {
		addition ad = new addition();
		System.out.println("addition of two intnumbers is : "+     ad.addition(56, 78));
		System.out.println("addition of two longnumbers is :"+     ad.addition(2344542L, 5667465L));
		System.out.println("addition of two double numbers is :" + ad.addition(67.8, 89.76));

	}
	public int addition(int n ,int a) {
		int b=n+a;
		return b;
	}
	public long addition(long c , long d) {
		long a = c+d;
		return a;
	}
	public double addition(double a , double b) {
		double c = a+b;
		return c;
	}

}
