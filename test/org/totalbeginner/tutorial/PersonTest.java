package org.totalbeginner.tutorial;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testPerson() {
		Person alexIIL = new Person();
		assertEquals("Unknown name", alexIIL.getName());
		assertEquals(3,alexIIL.getMaximumBooks());
	}

	public void testSetMaximumBooks() {
		Person p1 = new Person();
		p1.setMaximumBooks(10);
		assertEquals(10, p1.getMaximumBooks());
			
		
	}

	public void testSetName() {
		Person alexIIL = new Person();
		alexIIL.setName("Alex");
		assertEquals("Alex",alexIIL.getName());
	}

}
