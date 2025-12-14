package assignment;

public class Rectangle {
	int length;
	int breadth;
	
	
	Rectangle(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
		
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle (2,4);
		System.out.println("frist Rectangle length is :"+ r1.length+"  frist rectangle breadth is : "+  r1.breadth);
		
		Rectangle r2 = new Rectangle (3,9);
		System.out.println("frist Rectangle length is :"+ r2.length+"  frist rectangle breadth is : "+  r2.breadth);
		
		

	}

}
