package fristproject;

public class Studentdetails {
	String name ;
	int id;
	int age;
	long phoneNumber;
	char gender;
	static String collegeName="vivt";

	Studentdetails(String name,int id,int age,long phoneNumber,char gender){
		this. name=name  ;
		this. id=id;
		this. age=age;
		this. phoneNumber=phoneNumber;
		this. gender = gender ;
	}
	public static void main(String[] args) {
		Studentdetails s1 = new Studentdetails("sudheer",3,23,9876543201L,'m');
		
		System.out.println("name is: "+s1.name+" , id is: "+s1.id+" , age is: "+s1.age+" , phone number: "+s1.phoneNumber+" , gender is: "+s1.gender+" , college is: "+collegeName);
		
	
		Studentdetails s2 = new Studentdetails("anu",3,45,9876543210L,'f');
			
			
		System.out.println("name is: "+s2.name+" , id is: "+s2.id+" , age is: "+s2.age+" , phone number: "+s2.phoneNumber+" , gender is: "+s2.gender+" , college is: "+collegeName);


	}

}
