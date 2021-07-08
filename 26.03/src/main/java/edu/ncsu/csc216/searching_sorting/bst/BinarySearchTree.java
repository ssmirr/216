package edu.ncsu.csc216.searching_sorting.bst;

import java.util.NoSuchElementException;

public class BinarySearchTree {
	
	private IntTreeNode overallRoot;
	
	public BinarySearchTree() {
		overallRoot = null;
	}
	
    public boolean contains(int value) {
		// TODO
        return false
	}
	
	private boolean contains(IntTreeNode root, int value) {
		// TODO
        return false;
	}

	public void add(int value) {
		overallRoot = add(overallRoot, value);
	}
	
	private IntTreeNode add(IntTreeNode root, int value) {
		if (root == null) {
			root = new IntTreeNode(value);
		} else if (root.data > value) {
			root.left = add(root.left, value);
		} else if (root.data < value) {
			root.right = add(root.right, value);
		} //else duplicate
		return root;
	}
	
	public String preOrderTraversal() {
		return preOrderTraversal(overallRoot);
	}
	
	private String preOrderTraversal(IntTreeNode root) {
		String traversal = "";
		if (root != null) {
			traversal += root.data + " ";
			traversal += preOrderTraversal(root.left);
			traversal += preOrderTraversal(root.right);
		}
		return traversal;
	}
	
	public String inOrderTraversal() {
		return inOrderTraversal(overallRoot);
	}
	
	private String inOrderTraversal(IntTreeNode root) {
		String traversal = "";
		if (root != null) {
			traversal += inOrderTraversal(root.left);
			traversal += root.data + " ";
			traversal += inOrderTraversal(root.right);
		}
		return traversal;
	}
	
	public String postOrderTraversal() {
		return postOrderTraversal(overallRoot);
	}
	
	private String postOrderTraversal(IntTreeNode root) {
		String traversal = "";
		if (root != null) {
			traversal += postOrderTraversal(root.left);
			traversal += postOrderTraversal(root.right);
			traversal += root.data + " ";
		}
		return traversal;
	}


	private class IntTreeNode {
		public int data;
		public IntTreeNode left;
		public IntTreeNode right;
		
		public IntTreeNode(int data) {
			this(data, null, null);
		}
		
		public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

}
