package assignment;

public class Dog {
	String name;
	int age;
	String bread;
	String colour;
	
	Dog(String name,int age,String bread,String colour){
		this.name=name;
		this.age=age;
		this.bread=bread;
		this.colour=colour;
		
		
	}

	public static void main(String[] args) {
		Dog d1 = new Dog("snuff",6,"husky","white");
		System.out.println("dog name is :"+d1.name+" dog age is :"+d1.age+" dog bread is :"+d1.bread+" dog colour is :"+d1.colour);
		
		Dog d2 = new Dog("Browni",10,"street dog","brown");
		System.out.println("dog name is :"+d2.name+" dog age is :"+d2.age+" dog bread is :"+d2.bread+" dog colour is :"+d2.colour);
		
		
		

	}

}
