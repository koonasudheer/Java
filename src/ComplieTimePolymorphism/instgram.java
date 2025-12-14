package ComplieTimePolymorphism;

public class instgram {

	public static void main(String[] args) {
		login("sudheer123","sudheer@123");
		login("sudheer@132",5543221);
		login(908776554L,"shanareddy@143");
		

	}
	public static void login(  String name,String password) {
		System.out.println("login sucessful with user name"+name);
		
	}
	public static void login(String email,int password) {
		System.out.println("login sucessful with email"+email);
	}
	public static void login(long phonenumber,String password) {
		System.out.println("login scussesful with phonenumber"+phonenumber);
	}
	

}
