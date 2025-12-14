package assigementQuestionsPractice;

public class Student extends Person{
	String collegeName;
	int PhoneNumber;

	public Student(String name, int id, int age, String collegeName, int phoneNumber) {
		super(name, id, age);
		this.collegeName = collegeName;
		PhoneNumber = phoneNumber;
	}

	public static void main(String[] args) {
		Student s = new Student("sudheer",21,23,"Nagarjuna",98765432);
		s.place();
		System.out.println("student name is :"+s.name+" id is:"+s.id+" age is :"+s.age+" collagename is :"+s.collegeName+" s.phonenumber is:"+s.PhoneNumber);

	}

}
