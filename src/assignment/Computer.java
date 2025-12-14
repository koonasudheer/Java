package assignment;

public class Computer {
	String computer;
	int year;
	int gen;
	int prize;
	String place;
	
	Computer(String computer,int year,int gen,int prize,String place){
		this.computer = computer;
		this.year= year;
		this.gen=gen;
		this.prize=prize;
		this.place=place;
	}
	

	public static void main(String[] args) {
		Computer sk1 = new Computer("Window",2004,7,79000,"kurnool");
		System.out.println("computername is :"+sk1.computer+" computeryear is :"+sk1.year+" computergen is :"+sk1.gen+" computerprize is :"+sk1.prize+" computer place is :"+sk1.place);
		
		Computer sk2 = new Computer("Mac",2023,12,100000,"banglore");
		System.out.println("computername is :"+sk2.computer+" computeryear is :"+sk2.year+" computergen is :"+sk2.gen+" computerprize is :"+sk2.prize+" computer place is :"+sk2.place);
		

	}

}
