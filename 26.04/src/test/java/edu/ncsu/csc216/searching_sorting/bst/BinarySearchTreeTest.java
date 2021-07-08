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
	public void testGetMin() {
		assertEquals(-3, tree.getMin());
		
		//Create a new tree and attempt to get min
		tree = new BinarySearchTree();
		try {
			tree.getMin();
			fail("Should throw an exception");
		} catch (NoSuchElementException e) {
			assertEquals("", tree.inOrderTraversal());
		}
	}

}
