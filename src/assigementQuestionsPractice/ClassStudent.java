package assigementQuestionsPractice;

public class ClassStudent {
	private int rollNo;
	private String name;
	private int marks;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		
		return marks;
	}
	public void setMarks(int marks) {
		
		if(marks>=0 && (marks<=100) ) {
			this.marks = marks;
		}
		else {
			System.out.println("is invalid");
		}
		
	}

	
}
