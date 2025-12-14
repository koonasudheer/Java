package assigementQuestionsPractice;

public class Sbi extends Bank{
	int p ;
	int R;
	
	
	public Sbi(int p, int R) {
		super();
		this.p = p;
		this.R = R;
	}

	public void rateofintrest() {
		System.out.println(p*R*(1+R/1+R-1)); 
	}
	
	public static void main(String[] args) {
		Sbi sb = new Sbi(23,56);
		sb.rateofintrest();
		
	}

}
