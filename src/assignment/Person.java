package assignment;

public class Person {
	String name;
	String place;
	int age;
	long phonenumber;
	double height;
	char gender;
	
	Person(String name,String place,int age,long phonenumber,double height,char gender){
		this.name=name;
		this.place=place;
		this.age=age;
		this.phonenumber=phonenumber;
		this.height=height;
		this.gender=gender;
		
	}

	public static void main(String[] args) {
		Person ps1 = new Person("sahana","hyd",23,9874563210L,6.5,'f');
		System.out.println("person name is :"+ps1.name+" person place is :"+ps1.place+" person age is : "+ps1.age+" person phonenumber is:"+ps1.phonenumber+" person height is:"+ps1.height+" personal gender is:"+ps1.gender);
		
		Person ps2 = new Person("sudheer","hyd",23,2314569871L,6.7,'m');
		System.out.println("person name is :"+ps2.name+" person place is :"+ps2.place+" person age is : "+ps2.age+" person phonenumber is:"+ps2.phonenumber+" person height is:"+ps2.height+" personal gender is:"+ps2.gender);


	}

}
