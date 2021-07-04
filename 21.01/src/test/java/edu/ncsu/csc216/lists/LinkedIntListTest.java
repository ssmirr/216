package edu.ncsu.csc216.lists;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LinkedIntListTest {
	
	private LinkedIntList l;
	
    @Before
	protected void setUp() throws Exception {
		super.setUp();
		
		l = new LinkedIntList();
		l.add(4); l.add(-7); l.add(23); l.add(-1);
	}
	
    @Test
	public void testContains() {
		assertTrue(l.contains(4));
		assertFalse(l.contains(42));
	}

}
