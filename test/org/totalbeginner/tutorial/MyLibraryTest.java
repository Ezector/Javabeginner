package org.totalbeginner.tutorial;

import java.util.ArrayList;

import junit.framework.TestCase;

public class MyLibraryTest extends TestCase {

	private MyLibrary ml;

	//test constructor
	public void testMyLibrary(){
	ml = new MyLibrary("Test");
	
	assertEquals("Test",ml.name);
	
	assertTrue(ml.books instanceof ArrayList);
	assertTrue(ml.people instanceof ArrayList);
	}
	
	public void testAddBook(){
		//create objects
		ml.setup();
		
	}
	
}
