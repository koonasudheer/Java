package assigementQuestionsPractice;

public class Dog extends Mammal{
	  String place;
	  
	

	public Dog(String name, int noofAnimal, int amount, String colour, String place) {
		super(name, noofAnimal, amount, colour);
		this.place = place;
	}



	public static void main(String[] args) {
		Dog d = new Dog("puppy",2,250000,"brown","hyd");
		System.out.println(d.buying());
		System.out.println(d.animal());
		System.out.println(d.mammal());
		System.out.println("dog name is: "+d.name+"  numberofanimals: "+d.NoofAnimal+"  amount for the dog is : "+d.amount+" dog colour is:"+d.colour+" dog place of born is :"+d.place);

	}

}
