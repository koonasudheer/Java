package assigementQuestionsPractice;

public class Animals {
	String name;
	int prize;
	public Animals(String name, int prize) {
		super();
		this.name = name;
		this.prize = prize;
	}
	
	public void sound() {
		System.out.println("meow meow meow");
	}
	public String sleep() {
		return "Animal is sleeping";
		
	}

}
