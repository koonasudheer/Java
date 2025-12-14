package Exam;

public class students {
	String name;
	int id ;
	int rollNo;
	int phoneNumber;
	static String branch = "Ai&ml";
	static String  collageNmae = "vbit";
	
	students(String name,int id,int rollNo,int phoneNumber){
		this.name=name;
		this.id = id;
		this.rollNo = rollNo;
		this.phoneNumber= phoneNumber;
		
	}
	public static void main(String[] args) {
		students  s1 = new students ("anu",4,45,98765499);
		System.out.println("student name is :"+s1.name+" student id is :"+s1.id+"student rollno :"+s1.rollNo+" student branch is :"+ branch + collageNmae);
		
		
		students  s2 = new students ("priya",7,41,98765499);
		System.out.println("student name is :"+s2.name+" student id is :"+s2.id+"student rollno :"+s2.rollNo+" student branch is :"+ branch + collageNmae);
		
		students s3 = new students("sita",10,12,90877654);
		System.out.println("student name is :"+s3.name+" student id is :"+s3.id+"student rollno :"+s3.rollNo+" student branch is :"+ branch +  collageNmae);
		
		
		

	}

}
