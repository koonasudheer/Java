package assigementQuestionsPractice;

public class Car extends Vechical{
	String colour;
	

	public Car(String name, int money, String colour) {
		super(name, money);
		this.colour = colour;
		
	}


	public static void main(String[] args) {
		Car c = new Car("kia",140000,"red");
		System.out.println("car name is :  "+c.name+"  carprize is: "+c.money+"  carcolour is : "+c.colour);
		System.out.println(c.start());
		System.out.println(c.Drive());

	}

}
