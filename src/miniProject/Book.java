package miniProject;

public class Book {
	private String name;
	private int bid;
	private int cost;
	
	public Book(String name, int bid, int cost) {
		this.name = name;
		this.bid = bid;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	
	
	@Override
	public String toString() {
		return "Book [" + bid + "  name=" + name + " cost=" + cost + "]";
	}
	
	
	
	
}
