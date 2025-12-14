package Exam;

public class Addition {
	public  String concenation(String x,float f,long L) {
		return(x+f+L);
	 }
	
	public int addition(int a,int b) {
		return(a+b);
	}

	public static void main(String[] args) {
		Addition ad = new Addition();
		System.out.println(ad.addition(45, 89));
		System.out.println(ad.concenation("abhi",34.5F,79876L));

	}

}
