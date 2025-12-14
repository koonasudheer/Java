package assigementQuestionsPractice;

public class Cricle extends Shape {
	static double pi=3.14;
	
	int r;

	public Cricle(int r) {
		super();
		this.r=r;
		
		
	}
	
	public void area() {
		System.out.println("Circle Area is: "+(pi*r*r));
	}

	public static void main(String[] args) {
		Cricle c = new Cricle(3);
		c.area();
		

	}

}
