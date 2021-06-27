package edu.ncsu.csc216.linked_list;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListAddTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testAdd() {
		LinkedList<String> list = new LinkedList<String>();
		list.add(0, "Hello");
		list.add(1, "CSC");
		list.add(2, "216");
		assertEquals("Hello", list.get(0));
		assertEquals("CSC", list.get(1));
		assertEquals("216", list.get(2));
	}
}
