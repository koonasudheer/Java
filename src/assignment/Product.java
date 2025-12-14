package assignment;

public class Product {
	String name;
	double price;
	int qualtity;
	
	Product(String name,double price,int qualtity) {
		this.name = name;
		this.price=price;
		this.qualtity=qualtity;
		
	}
	double sell(int numSold) {
		qualtity-=numSold;
		return numSold* price;
	}
	int restock(int numadded) {
		qualtity+=numadded;
		return qualtity;
	}

	public static void main(String[] args) {
		Product p = new Product("pen",34,100);
		System.out.println("revenue is : "+p.sell(5));
		System.out.println("new Qualtity is :"+p.restock(20));
		

	}

}
