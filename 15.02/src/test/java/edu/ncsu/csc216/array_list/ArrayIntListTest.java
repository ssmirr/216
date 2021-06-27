package edu.ncsu.csc216.array_list;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayIntListTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		ArrayIntList list = new ArrayIntList();
		assertEquals(0, list.size());
		list.add(3);
		assertEquals(1, list.size());
		assertEquals(3, list.get(0));
	}
	
	@Test
	public void testAddAtIdx() {
		ArrayIntList list = new ArrayIntList();
		assertEquals(0, list.size());
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1, 4);
		assertEquals(4, list.size());
		assertEquals(4, list.get(1));
	}
	
	@Test
	public void testCapacity() {
		ArrayIntList list = new ArrayIntList();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.add(11);
		assertEquals(11, list.size());
		assertEquals(11, list.get(10));
	}
	
	@Test
	public void testRemoveAtIdx() {
		ArrayIntList list = new ArrayIntList();
		list.add(3);
		list.add(8);
		list.add(9);
		list.add(7);
		list.add(5);
		list.add(12);
		assertEquals(6, list.size());
		
		assertEquals(9, list.remove(2));
		
		assertEquals(5, list.size());
		assertEquals(3, list.get(0));
		assertEquals(8, list.get(1));
		assertEquals(7, list.get(2));
		assertEquals(5, list.get(3));
		assertEquals(12, list.get(4));
	}
	
	@Test
	public void testGetOutOfBounds() {
		ArrayIntList list = new ArrayIntList();
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals(3, list.size());
		
		try {
			list.get(-3);
			fail();
		} catch (IndexOutOfBoundsException e) {
			assertEquals(3, list.size());
		}
		
		try {
			list.get(3);
			fail();
		} catch (IndexOutOfBoundsException e) {
			assertEquals(3, list.size());
		}
	}

}
