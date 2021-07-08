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
	public void testRemove() {
		//Remove a node with no children
		tree.remove(42);
		assertEquals("-3 29 55 60 87 91 ", tree.inOrderTraversal());
		
		//Remove a node with left child
		tree.remove(29);
		assertEquals("-3 55 60 87 91 ", tree.inOrderTraversal());
		
		//Remove a node with two children
		tree.remove(87);
		assertEquals("-3 55 60 91 ", tree.inOrderTraversal());
		
		//Remove a node with right child
		tree.remove(60);
		assertEquals("-3 55 91 ", tree.inOrderTraversal());
		
		//Attempt to remove a node that doesn't exist
		tree.remove(60);
		assertEquals("-3 55 91 ", tree.inOrderTraversal());
		
		//Keep removing nodes
		tree.remove(55);
		assertEquals("-3 91 ", tree.inOrderTraversal());
		
		tree.remove(91);
		assertEquals("-3 ", tree.inOrderTraversal());
		
		tree.remove(-3);
		assertEquals("", tree.inOrderTraversal());
	}
	

}
