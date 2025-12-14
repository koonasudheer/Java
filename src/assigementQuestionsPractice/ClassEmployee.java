package assigementQuestionsPractice;

public class ClassEmployee {
	String name;
	int id;
	double salary;
	
	

	public ClassEmployee() {
		super();
		
	}
	
	public ClassEmployee(String name, int id) {
	
		this.name = name;
		this.id = id;
	}
	
	public ClassEmployee(String name, int id, double salary) {
	
		this(name,id);
		this.salary = salary;
	}

	public static void main(String[] args) {
		ClassEmployee ca = new ClassEmployee();
		ClassEmployee cs = new ClassEmployee("sudheer",04);
		System.out.println("name os the employee is :"+ cs.name+" id of the employee is :"+ cs.id);
		ClassEmployee cs1 = new ClassEmployee("sudheer",9,89.044);
		System.out.println("name of the employee is :"+  cs1.name+" employee id is :"+ cs1.id+" employee salary is : "+ cs1.salary);
		

	}

}
