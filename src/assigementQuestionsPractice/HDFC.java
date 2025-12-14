package assigementQuestionsPractice;

public class HDFC extends Bank{
	int P;
	int T;
	int R;
	public HDFC(int P, int T,int R) {
		super();
		this.P = P;
		this.T = T;
		this.R = R;
	}
	
	public void rateofintrest() {
		System.out.println(P*R*T/100);
		
	}
	public static void main(String[] args) {
		HDFC h = new HDFC(120,450,600);
		h.rateofintrest();
	}

}
