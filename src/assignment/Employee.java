package assignment;

public class Employee {
	String name;
	int id;
	int salary;
	String subject;
	
	
	Employee(String name,int id,int salary,String subject){
		this.name = name;
		this.id= id;
		this.salary= salary;
		this.subject= subject;
		
	}

	public static void main(String[] args) {
		Employee es1 = new Employee("anu",4,45000,"maths");
		System.out.println("name is :"+es1.name+",id is :"+  es1.id+", salary is :"+  es1.salary +   "subject is "  + es1.subject);
		
		Employee em1 = new Employee("priya",9,43000,"Science");
		System.out.println("name is :"+em1.name+",id is :"+ em1.id+", salary is :"+  em1.salary +   "subject is "  + em1.subject);
		
		Employee ea1 = new Employee("divya",7,50000,"telugu");
		System.out.println("name is :"+ea1.name+",id is :"+ea1.id+", salary is :"+ ea1.salary +   "subject is "   + ea1.subject);
         	

	}

}
