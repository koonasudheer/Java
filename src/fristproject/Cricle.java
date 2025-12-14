package fristproject;

public class Cricle {
	static double pi =3.14;
	int radius;
	
	Cricle(int radius){
		this.radius=radius;
	}
	
	public static void main(String[] args) {
		Cricle c1 = new Cricle(2);
		System.out.println("frist cricle radius is "+ (c1.radius));
		System.out.println("area of cricle is "+ (pi*c1.radius*c1.radius));
		
		Cricle c2 = new Cricle(5);
		System.out.println("frist cricle radius is "+ (c2.radius));
		System.out.println("area of cricle is "+ (pi*c2.radius*c2.radius));
		
		Cricle c3 = new Cricle(8);
	    System.out.println("frist cricle radius is "+ (c3.radius));
		System.out.println("area of cricle is "+ (pi*c3.radius*c3.radius));

	}
}
