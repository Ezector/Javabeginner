package org.totalbeginner.tutorial;

import junit.framework.TestCase;

public class BookTest extends TestCase {

	
	public void testBook() {
		Book b1 = new Book("Harry Potter");
		assertEquals("Harry Potter", b1.title);
		assertEquals("unknown author", b1.author);
	}
	
	public void testGetPerson(){
		Book b1 = new Book("Batman Returns");
		Person p1 = new Person();
		p1.setName("Lucas");
		
		//Loaning method
		b1.setPerson(p1);
		
		//get person name
		String testName = b1.getPerson().getName();
		
		assertEquals("Lucas", testName);
	}
}
