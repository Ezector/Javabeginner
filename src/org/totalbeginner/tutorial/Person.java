package org.totalbeginner.tutorial;

public class Person {

	//Fields
	private String name;
	private int maximumBooks;

	//Constructor
	public Person() {
		name = "Unknown name";
		maximumBooks = 3;
	}
	
	
	//Methods
	public String getName() {
		return name;
	}
	
	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}

	public void setName(String anyname) {
		name = anyname;
	}
	
	
}
