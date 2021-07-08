# Exercise 26.04

Write the `getMin()` method that returns the smallest value of the BST.

Assume the `getMin` method belongs to a `SearchTree` class that has a pointer to the root node. You should write a public/private pair.

```java | {type: 'file', path: '/216/26.04/src/main/java/edu/ncsu/csc216/searching_sorting/bst/BinarySearchTree.java'}
package edu.ncsu.csc216.searching_sorting.bst;

import java.util.NoSuchElementException;

public class BinarySearchTree {
	
	private IntTreeNode overallRoot;
	
	public BinarySearchTree() {
		overallRoot = null;
	}
	
    public int getMin() {
		// TODO
        return 0;
	}
	
	private int getMin(IntTreeNode root) {
		// TODO
        return 0;
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
```

Here are some tests to verify your implementation:

```java
private BinarySearchTree tree = new BinarySearchTree();
tree.add(55);
tree.add(29);
tree.add(87);
tree.add(-3);
tree.add(42);
tree.add(60);
tree.add(91);

assertEquals(-3, tree.getMin());

// Create a new tree and attempt to get min
tree = new BinarySearchTree();
try {
    tree.getMin();
    fail("Should throw an exception");
} catch (NoSuchElementException e) {
    assertEquals("", tree.inOrderTraversal());
}
```

Click on ▶, to run the tests:

```bash | {type: 'command', failed_when: 'exitCode!=0'}
mvn test -q -Dtest=BinarySearchTreeTest
```

<br>

And finally submit the google form below:

> _If you are not able to see questions below [click here](https://docs.google.com/forms/d/e/1FAIpQLSc3gYHy8JOoy8Q1d7WFLxTyaMHJ6wJbRXthBMP4Skbn6vDJTw/viewform?hl=en_US&formkey=dDJORUdxTTBOalFHTWdmdUpQLWkyemc6MQ#gid=0) to open the form in a new tab._

<iframe src="https://docs.google.com/forms/d/e/1FAIpQLSc3gYHy8JOoy8Q1d7WFLxTyaMHJ6wJbRXthBMP4Skbn6vDJTw/viewform?embedded=true" height="3963" frameborder="0" marginheight="0" marginwidth="0" style="width: 100%;">Loading…</iframe>
