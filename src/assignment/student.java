package assignment;

public class student {
	String name;
	int id;
	boolean isEnrolled;
	
	student(String name,int id){

		this.name = name;
		this.id = id;
		
	}
	
	String enrolledStatus(boolean status) {
		isEnrolled = status;
		return name;
	}
	
	String getEnrollmentStatus() {
		return (isEnrolled)? "Enrolled":"notEnrolled";
	}

	public static void main(String[] args) {
		student s = new student("abhi",455);
		System.out.println("student: " + s.enrolledStatus(true));
		System.out.println("status : "+s.getEnrollmentStatus());
		

	}

}
