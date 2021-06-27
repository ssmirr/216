package edu.ncsu.csc216.linked_list;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedIntListTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		LinkedIntList list = new LinkedIntList();
		assertEquals(0, list.size());
		list.add(3);
		assertEquals(1, list.size());
		assertEquals(3, list.get(0));
	}
	
	@Test
	public void testAddAtIdx() {
		LinkedIntList list = new LinkedIntList();
		assertEquals(0, list.size());
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1, 4);
		assertEquals(4, list.size());
		assertEquals(4, list.get(1));
	}
	
	@Test
	public void testGet() {
		LinkedIntList list = new LinkedIntList();
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals(1, list.get(0));
		assertEquals(2, list.get(1));
		assertEquals(3, list.get(2));
		
	}
	
	@Test
	public void testAddSorted() {
		LinkedIntList list = new LinkedIntList();
		//Empty list
		list.addSorted(-4);
		assertEquals(1, list.size());
		assertEquals(-4, list.get(0));
		
		//Front of list
		list.addSorted(-7);
		assertEquals(2, list.size());
		assertEquals(-7, list.get(0));
		assertEquals(-4, list.get(1));
		
		//End of list
		list.addSorted(3);
		assertEquals(3, list.size());
		assertEquals(-7, list.get(0));
		assertEquals(-4, list.get(1));
		assertEquals(3, list.get(2));
		
		//Middle of list
		list.addSorted(0);
		assertEquals(4, list.size());
		assertEquals(-7, list.get(0));
		assertEquals(-4, list.get(1));
		assertEquals(0, list.get(2));
		assertEquals(3, list.get(3));
		
	}
	
	@Test
	public void testRemoveAtIdx() {
		LinkedIntList list = new LinkedIntList();
		list.add(23);
		assertEquals(1, list.size());
		try {
			list.remove(1);
			fail();
		} catch (IndexOutOfBoundsException e) {
			assertEquals(1, list.size());
		}
	}

}
