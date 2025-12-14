package assigementQuestionsPractice;

public class Mammal extends Animal {
	 String colour;

	 public Mammal(String name, int noofAnimal, int amount, String colour) {
		super(name, noofAnimal, amount);
		this.colour = colour;
	 }
	 
	 public String mammal() {
		 return "bule whale is the biggest mammal";
	 }

}
