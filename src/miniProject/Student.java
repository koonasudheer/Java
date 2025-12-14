package miniProject;

import java.util.*;

public class Student extends User {
	private String Branch;
	HashMap<Integer, Book>borrowedBooks;
	

	public Student(String name, int id, String branch, HashMap<Integer, Book> hm) {
		super(name, id);
		Branch = branch;
		borrowedBooks = hm;
	}

	@Override
	public String toString() {
		return "StudentUser [Branch=" + Branch + "]";
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}
	
	
	
	

}
