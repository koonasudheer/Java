package miniProject;

public class FacultyUser extends User {
	 private String dept;
	

	public String getdept() {
		return dept;
	}

	public void setdept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "FacultyUser [dept=" + dept + "]";
	}
	

	public FacultyUser(String name, int id, String dept) {
		super(name, id);
		this.dept = dept;
	}

	

}
