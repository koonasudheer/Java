package miniProject;

import java.util.HashMap;

public abstract class LibraryOperations {
	
	
	public abstract void addBook(Book b, HashMap<Integer, Book> hm);
	public abstract void registerUser(HashMap<Integer, Student> hm);
	
	public abstract void issueBook(HashMap<Integer, Student> users, int uid, HashMap<Integer, Book> books);
	public abstract void returnBook(HashMap<Integer, Student> users, HashMap<Integer, Book> books);
	
	public abstract void displayAvailableBooks(HashMap<Integer, Book> books);
	
}
