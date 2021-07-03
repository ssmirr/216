package edu.ncsu.csc216.lists;

import junit.framework.TestCase;

public class LinkedIntListTest extends TestCase {
	
	private LinkedIntList l;

	protected void setUp() throws Exception {
		super.setUp();
		
		l = new LinkedIntList();
		l.add(4); l.add(-7); l.add(23); l.add(-1);
	}
	
	public void testContains() {
		assertTrue(l.contains(4));
		assertFalse(l.contains(42));
	}

}
