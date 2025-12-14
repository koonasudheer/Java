package assigementQuestionsPractice;

public class Employee extends Person {
	String Place;
	char gender;
	

	public Employee(String name, int id, int age, String place,char gender) {
		super(name, id, age);
		this.Place = place;
		this.gender = gender;
	}


	public static void main(String[] args) {
		Employee e = new Employee("anusha",02,23,"hyd",'f');
		e.place();
		System.out.println("name of the employee is :"+e.name+" employee id is:"+e.id+"  employee age is :"+e.age +" employee place of work is :"+e.Place+" employee gender is:"+e.gender);
		

	}

}
