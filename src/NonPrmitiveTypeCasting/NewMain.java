package NonPrmitiveTypeCasting;

public class NewMain {

	public static void main(String[] args) {
		Vechical v = new Car("kia","red",4500000);
		System.out.println(v.toString());
		System.out.println(v.name);
		System.out.println(v.Colour);
		v.tires();
		v.clean();
		
		Car s = (Car)v;
		System.out.println(s.toString());
		System.out.println(s.name);
		System.out.println(s.Colour);
		s.tires();
		s.clean();
		s.driving();
		System.out.println(s.prize);
		s.cleaning();

	}

}
