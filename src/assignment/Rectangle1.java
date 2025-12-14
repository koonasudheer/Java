package assignment;

public class Rectangle1 {
	 double width; double height;

	Rectangle1(double width,double height){
		this.width = width;
		this.height = height;
		
	}
	  double calculatorArea() {
		  return(width*height);
	  }
	double calculatorParameter() {
		return 2 *(width+height);
		
	}
	        public static void main(String[] args) {
			System.out.println("main method starts from here .........");
			Rectangle1 sr = new Rectangle1(2.0,6.89);
			System.out.println("area is :"+ sr.calculatorArea());
			System.out.println("parameter is :"+ sr.calculatorParameter());
			System.out.println("main medthod end here..........");
	 }

}
