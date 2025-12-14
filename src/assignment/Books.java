package assignment;

public class Books {
	String name;
	int  year;
	String Author;
	String moral;
	int date;
	char gender ;
	
	Books(String name,int year,String authour, String moral,int date, char gender){
		this.name = name;
		this.year = year;
		this.Author = authour;
		this.moral = moral;
		this.date = date;
		this.gender = gender;
		
	}
	public static void main(String[] args) {
		Books bi1= new Books("love book",2025,"sudheer","dont trust the people",12,'m');
		System.out.println("book name is :"+bi1.name+",book year is :"+bi1.year+", book Author is : " +bi1.Author+ "book moral is :  " +"book date is :  "+bi1.date);
		
		Books bi2= new Books("god book",2025,"sahana","all the is well",13,'f');
		System.out.println("book name is :"+bi2.name+",book year is :"+bi2.year+", book Author is : " +bi2.Author+ "book moral is :  " +"book date is :  "+bi2.date);


	}

}
