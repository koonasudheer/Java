package WhileQuestions;

public class productOfNumbers {

	public static void main(String[] args) {
		int product = 1 ;
		int i = 1;
		do {
			product*=i;
			i++;
		}
		while(i<=10);
		System.out.println(product);

	}

}
