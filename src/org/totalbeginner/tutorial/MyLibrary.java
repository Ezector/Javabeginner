package org.totalbeginner.tutorial;

import java.util.ArrayList;


public class MyLibrary {

	String name;
	ArrayList<Book> books;
	ArrayList<Person> people;
	private Book b1;
	private Book b2;
	private Person p1;
	private Person p2;

	public MyLibrary(String name) {
		this.name = name;
		books = new ArrayList<Book>();
		people = new ArrayList<Person>();
		
		
	}

	public String getName() {
		return name;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public ArrayList<Person> getPeople() {
		return people;
	}

	public void setup(){
		b1 = new Book("Book1");
		b2 = new Book("Book2");
		
		p1 = new Person();
		p2 = new Person();
		p1.setName("Alex");
		p2.setName("Lucas");
		
		MyLibrary ml = new MyLibrary("test");
	}
	
}
