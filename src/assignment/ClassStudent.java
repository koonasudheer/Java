package assignment;

public class ClassStudent {
	String name;
	int id ;
	static String branch = "ai&ml";
	String game;
	int rollno;
	char gender;
	static String collageName = "vbit";
	
	ClassStudent(String name,int id,String game,int rollno,char gender){
		this.name=name;
		this.id=id;
		this.game=game;
		this.rollno = rollno;
		this.gender = gender;
		
	}
	

	public static void main(String[] args) {
		ClassStudent s1 = new ClassStudent("anu",4,"cricket",45,'f');
		System.out.println("student name is :"+s1.name+" student id is :"+s1.id+" student game name : " +s1.game+"student rollno :"+s1.rollno+" student gender is:"+ s1.gender+" collage name is:"+collageName+" student branch is :"+ branch);
		
		ClassStudent s2 = new ClassStudent("priya",7,"hand ball",41,'f');
		System.out.println("student name is :"+s2.name+" student id is :"+s2.id+" student game name : " +s2.game+"student rollno :"+s2.rollno+" student gender is:"+ s2.gender+" collage name is:"+collageName+" student branch is :"+ branch);
		
	    ClassStudent s3 = new ClassStudent("sita",10,"hockey",12,'f');
		System.out.println("student name is :"+s3.name+" student id is :"+s3.id+" student game name : " +s3.game+"student rollno :"+s3.rollno+" student gender is:"+ s3.gender+" collage name is:"+collageName+" student branch is :"+ branch);
		
		ClassStudent s4 = new ClassStudent("pavan",11,"throw ball",50,'m');
		System.out.println("student name is :"+s4.name+" student id is :"+s4.id+" student game name : " +s4.game+"student rollno :"+s4.rollno+" student gender is:"+ s4.gender+" collage name is:"+collageName+" student branch is :"+ branch);
		
		

	}

}
