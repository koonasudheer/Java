package assigementQuestionsPractice;

public class ICICi extends Bank{
	int P;
	int R;
	int T;
	
	public ICICi(int p, int r, int t) {
		super();
		P = p;
		R = r;
		T = t;
		
	}
	
	public void rateofintrest() {
		System.out.println(P*R*T/100);
	}

	public static void main(String[] args) {
		ICICi i = new ICICi(20,17,96);
		i.rateofintrest();
		
		

	}

}
