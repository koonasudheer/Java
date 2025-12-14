package assignment;

public class Car {
	
	String name;
	String model;
	int date;
	int prize;
	int sittingarrngement;
	
	Car(String name, String model,int date,int prize,int sitting){
		this.name=name;
		this.model=model;
		this.date=date;
		this.prize=prize;
		this.sittingarrngement = sitting;
		
		
	}

	public static void main(String[] args) {
		Car c1 = new Car("tesla","Top model",12,900000,6);
		System.out.println(("car name is : "  +c1.name+"  car model is :" +c1.model+" car relased date :" +c1.date+" car prize is :"+ c1.prize +" car sitting arrngemnt is :"+c1.sittingarrngement));
	
		Car c2 = new Car("kia","top high end model",13,10000000,5);
		System.out.println(("car name is : "  +c2.name+"  car model is :" +c2.model+" car relased date :" +c2.date+" car prize is :"+ c2.prize +" car sitting arrngemnt is :"+c2.sittingarrngement));
	

	}

}
