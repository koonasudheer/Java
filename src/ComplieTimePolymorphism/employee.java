package ComplieTimePolymorphism;

public class employee {
	String name;
	int id;
	double salary;
	char gender;
	long phonenumber;
	
	public employee(String name,int id) {
		this.name= name;
		this.id = id;
	}
	public employee(String name,int id,double salary) {
		this(name,id);
		this.salary= salary;
	}
	public employee(String name,int id,double salary,char gender) {
		this(name,id,salary);
		this.gender= gender;
	}
	public employee(String name,int id,double salary,char gender,long phonenumber) {
		this(name,id,salary,gender);
		this.phonenumber= phonenumber;
	}
	

	public static void main(String[] args) {
		employee ep1 = new employee("sahana" , 1);
		System.out.println(ep1.name+" , " +ep1.id );
		
		employee ep2 = new employee("sudheer" , 14 , 4500.0);
		System.out.println(ep2.name+" , " +ep2.id+", "+ep2.salary );
		
		employee ep3 = new employee("anu" , 1 , 450000.0,'f');
		System.out.println(ep3.name+" , " +ep3.id+", "+ep3.salary+", "+ep3.gender );
		
		employee ep4 = new employee("kavitha" , 1 , 45000000.0 , 'f' , 98765043L);
		System.out.println(ep4.name+" , " +ep4.id+", "+ep4.salary+", " + ep4.gender+", "+ep4.phonenumber);
	
	

	}

}
