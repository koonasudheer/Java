package assignment;

public class cars {
	String make;
	String model;
	int lastolichangeMileage;
	
	cars(String make,String model){
		this.make =make;
		this.model = model;
		this.lastolichangeMileage = 0;
	}
	
	String updateOilChange(int currentmileage) {
		lastolichangeMileage = currentmileage;
		return "oil changed at" + currentmileage;
		
	}
	boolean needsOilChange(int currentmileage) {
		 return (currentmileage - lastolichangeMileage) >= 5000;
		
	}

	public static void main(String[] args) {
		cars c = new cars("Honda" , "city");
		System.out.println(c.updateOilChange(10000));
		System.out.println("needs oil change?"+ c.needsOilChange(169000));

	}

}
