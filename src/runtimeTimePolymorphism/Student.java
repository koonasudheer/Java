package runtimeTimePolymorphism;

public class Student {
	String name;
	int id;
	int age;
	char gender;
	long phonenumber;
	
	    public Student(String name, int id, int age, char gender, long phonenumber) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.phonenumber = phonenumber;
	}


	public static void main(String[] args) {
		Student s = new Student("sudheer",7,23,'M',908876534L);
		System.out.println("nameis : " +s.name + "id is : " +s.id + " age is :" + s.age + " gender is : "+ s.gender + " phonenumber is : " + s.phonenumber);
		System.out.println(s);
		System.out.println(s.toString());

	}
	public String toString() {
		return "{ student [name is : "  +name+ ", id is : " + id+", age is : " +age+" , gender is : "+gender+", phonenumber is : "+phonenumber+"]}";
	 }
	
   }
 


