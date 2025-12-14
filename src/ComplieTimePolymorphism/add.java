package ComplieTimePolymorphism;

public class add {
	int ab;
	int bc;
	double cd;
	double da;
	long mj;
	long bp;
	
	public add(int ab ,int bc) {
		this.ab=ab;
		this.bc=bc;
	}
	public add(double cd,double da) {
		this.cd=cd;
		this.da= da;
	}
	public add(long mj,long bp) {
		this.mj=mj;
		this.bp=bp;
	}

	public static void main(String[] args) {
		add ad =new add(12,34);
		System.out.println("addition of two numbers is:"+(ad.ab+ad.bc));
		
		add mj = new add(696.12,484.96);
		System.out.println("addition of two double number is:" + (mj.cd+mj.da));
		
		add ab = new add(95623447L,8556114L);
		System.out.println("addition of two long numbers is :"+(ab.mj+ab.bp));
		

	}

}
