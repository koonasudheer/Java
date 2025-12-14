package assigementQuestionsPractice;

public class Machine implements Printer,Scanner{

	
	@Override
	public String seeing() {
		return "seeing the news paper";
	}

	@Override
	public void print() {
		System.out.println("printing the news paper");
		
	}
	
	public static void main(String[] args) {
		Machine m = new Machine();
		System.out.println(Printer.name);
		System.out.println(m.seeing());
		Printer.xerox();
		Scanner.scan();
		m.print();
		
		
		
		
	}

}
