package miniProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import java.util.Scanner;

public class Execution extends LibraryOperations implements FineCalculator {
	static int id = 1;
	static int currId = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Student> users = new HashMap<>();
		HashMap<Integer, Book> books = new HashMap<>();
		LibraryOperations libOps = new Execution();
		System.out.println("Welcome to Library Management System");
		System.out.println("--------------------------------------");
		Scanner sc = new Scanner(System.in);
		libOps.addBook(new Book("Java", 1, 300), books);
		libOps.addBook(new Book("Python", 2, 250), books);
		libOps.addBook(new Book("C++", 3, 200), books);
		libOps.addBook(new Book("JavaScript", 4, 150), books);
		libOps.addBook(new Book("Data Structures", 5, 350), books);
		libOps.addBook(new Book("Algorithms", 6, 400), books);
		libOps.addBook(new Book("Operating Systems", 7, 450), books);
		libOps.addBook(new Book("Database Management", 8, 500), books);
		libOps.addBook(new Book("Computer Networks", 9, 550), books);
		libOps.addBook(new Book("Software Engineering", 10, 600), books);
		libOps.addBook(new Book("Artificial Intelligence", 11, 700), books);
		libOps.addBook(new Book("Machine Learning", 12, 800), books);
		libOps.addBook(new Book("Deep Learning", 13, 900), books);
		libOps.addBook(new Book("Data Science", 14, 1000), books);
		libOps.addBook(new Book("Big Data", 15, 1100), books);
		while(true) {
			System.out.println("--------------------------------------");
			System.out.println("Choose 1 option");
			System.out.println("--------------------------------------");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Take Book");
			System.out.println("4. Return Book");
			System.out.println("5. Display available Books");
			System.out.println("6. Exit");
			System.out.println("--------------------------------------");
			System.out.println("Choose : ");
			
			int inp = sc.nextInt();
			System.out.println("--------------------------------------");
			
			switch(inp) {
			case 1:
				System.out.println("Registering User");
				libOps.registerUser(users);
				break;
			case 2:
				System.out.println("Logging in user");
				System.out.println("--------------------------------------");
				System.out.println("Enter User ID:");
				int uid = sc.nextInt();
				if(users.containsKey(uid)) {
					System.out.println("Login Successful");
					currId = uid;
				}else {
					System.out.println("User not found, Please register first");
					System.out.println("--------------------------------------");
					libOps.registerUser(users);
					
				}
				break;
			case 3:
				System.out.println("Taking Book");
				libOps.issueBook(users, currId, books);
				break;
			case 4:
				System.out.println("Returning Book");
				libOps.returnBook(users, books);
				break;
			case 5:
				System.out.println("Displaying available Books");
				libOps.displayAvailableBooks(books);
				break;
			case 6:
				System.out.println("Exiting...");
				sc.close();
				System.exit(0);
				break;
			}
			
		}
	}
	

	
	

	@Override
	public int calculateFine(int days) {
		// TODO Auto-generated method stub
		if(days > 10) {
			return (days - 10) * 2;
		}
		return 0;
	}

	@Override
	public void addBook(Book b, HashMap<Integer, Book> hm) {
		// TODO Auto-generated method stub
		if(!hm.containsKey(b.getBid())) {
			hm.put(b.getBid(), b);
//			System.out.println("Book Added: " + b);
		}else {
			System.out.println("Book with ID " + b.getBid() + " already exists.");
		}
	}

	

	

	

	@Override
	public void issueBook(HashMap<Integer, Student> users, int uid, HashMap<Integer, Book> books) {
		System.out.println("curr id" + uid);
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book ID to issue:");
		int bid = sc.nextInt();
		// Logic to issue book
		if(books.containsKey(bid)) {
			Book b = books.get(bid);
			System.out.println("Book Issued: " + b);
			books.remove(bid);
			System.out.println(users);
			users.get(uid).borrowedBooks.put(bid, b);
		}else {
			System.out.println("Book with ID " + bid + " not found.");
		}
		
	}

	@Override
	public void returnBook(HashMap<Integer, Student> users, HashMap<Integer, Book> books) {
		// TODO Auto-generated method stub
		if(currId == 0)System.out.println("Login first");
		LibraryOperations libOps = new Execution();
		Scanner sc = new Scanner(System.in);
		int uid = currId;
		System.out.println("Returning Book ID: ");
		int bid = sc.nextInt();
		System.out.println("Enter no of days late:");
		int days = sc.nextInt();
		if(days > 10) {
			int fine = calculateFine(days);
			System.out.println("You have a fine of: " + fine + " for returning the book late.");
			
		}
		int fine = calculateFine(days);
		
		libOps.addBook(users.get(currId).borrowedBooks.get(bid), books);
		System.out.println("Book Returned: " + books.get(bid));
		System.out.println(users);
		users.get(uid).borrowedBooks.remove(bid);
		
	}

	@Override
	public void registerUser(HashMap<Integer, Student> hm) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		Student u = new Student(name, id++, "CSE", new HashMap<Integer, Book>());
		hm.put(u.getId(), u);
		System.out.println("User Registered with ID: " + u.getId());
		currId = u.getId();
	}





	@Override
	public void displayAvailableBooks(HashMap<Integer, Book> books) {
		// TODO Auto-generated method stub
		System.out.println("Available Books:");
		for(Book b : books.values()) {
			System.out.println(b);
		}
	}




}