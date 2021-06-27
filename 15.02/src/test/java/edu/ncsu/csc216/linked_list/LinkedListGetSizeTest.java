package edu.ncsu.csc216.linked_list;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListGetSizeTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testGet() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("CSC");
		list.add("216");
		assertEquals("Hello", list.get(0));
		assertEquals("CSC", list.get(1));
		assertEquals("216", list.get(2));
	}

	@Test
	public void testSize() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertEquals(0, list.size());
		list.add(0);
		assertEquals(1, list.size());
		list.add(1);
		assertEquals(2, list.size());
		list.add(2);
		assertEquals(3, list.size());
	}

}
