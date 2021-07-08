package edu.ncsu.csc216.searching_sorting.bst;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {
	
	private BinarySearchTree tree;

	@Before
	public void setUp() throws Exception {
		tree = new BinarySearchTree();
		tree.add(55);
		tree.add(29);
		tree.add(87);
		tree.add(-3);
		tree.add(42);
		tree.add(60);
		tree.add(91);
	}

	@Test
	public void testContains() {
		assertTrue(tree.contains(29));
		assertTrue(tree.contains(55));
		assertFalse(tree.contains(63));
		assertFalse(tree.contains(35));
	}
	
}
