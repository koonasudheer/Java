package assignment;

public class Employee1 {
	String name;
	double hourlyRate;
	
	Employee1(String name,double hourlyRate){
		this.name = name;
		this.hourlyRate = hourlyRate;
	}
	
	   double calculateWeeklypay(int hours){
		   return   hours * hourlyRate;
		
	}
	   double applyRaise(double pertcange ) {
		   hourlyRate += hourlyRate * (pertcange /100);
		   return hourlyRate;
	   }
	   

	public static void main(String[] args) {
		Employee1 e = new Employee1 ("jhon",200);
		System.out.println("weekly pay: "+ e.calculateWeeklypay(40));
		System.out.println("new rate : " + e.applyRaise(10));
		

	}

}
