
public class StudentGrade {

	public static void main(String[] args) {
		int marks = 78;
		if(marks>=90 && marks <= 100) {
			System.out.println("Grade A+");
		}
		else if((marks>=70 && marks <= 89)) {
			System.out.println( "grade A" );
		}
		else if((marks>=60 && marks <= 69)) {
			System.out.println("Grade B+");
		}
		else if (marks>=50 && marks <= 59) {
			System.out.println("Grade B");
		}
		else if ((marks>=30 && marks <= 49)) {
			System.out.println("grade c" );
		}
		else if (marks>=0 && marks <= 29) {
			System.out.println("fail");
		}
		else {
			System.out.println("Invaild Grade");
		}

	}

}
