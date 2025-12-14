package conditionsStatement;

public class MaximumOfThreeNumbers {

	public static void main(String[] args) {
		int a  = 130;
		int b = 230;
		int c = 456;
		int max;
		if(a>b) {
			max = a;
		}
		else{
			max = b;
		}
		if (c>max) {
			max = c;
		}
		System.out.println(max + " is the maximum os three numbers ");

	}

}
