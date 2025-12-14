package assigementQuestionsPractice;

public class Display {
	
	public String reading() {
		return "I'M Reading for the Exam";
	}
	
	public int money() {
		return 140000;
	}
	public void cost() {
		System.out.println("the amount of the computer is.........");
		System.out.println(14);
	}
	
	

	public static void main(String[] args) {
		
		Display D = new Display();
		System.out.println(D.reading());
		System.out.println(D.money());
		D.cost();

	}

}
