package org.totalbeginner.tutorial;

public class Book {

	String title;
	String author;
	Person person;

	public Book(String string) {
		title = string;
		author = "unknown author";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setPerson(Person p1) {
		this.person = p1;
	}

	public Person getPerson() {
		return this.person;
	}

}
