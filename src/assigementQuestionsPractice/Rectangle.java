package assigementQuestionsPractice;

public class Rectangle extends Shape {
	int w;
	int h;
	

	public Rectangle(int h, int w) {
		super();
		this.w = w;
		this.h=h;
	}
	
	public void area() {
		System.out.println("Rectangle Area is: "+(h*w));
	}


	public static void main(String[] args) {
		Rectangle R = new Rectangle(23,45);
		R.area();
		

	}

}
