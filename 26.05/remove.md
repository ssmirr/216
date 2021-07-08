# Exercise 26.05

Write a `remove` method that removes the given integer value from the tree, if present. Throw a `NoSuchElementException` if the value doesn't exist in the tree.

```java | {type: 'file', path: '/216/26.05/src/main/java/edu/ncsu/csc216/searching_sorting/bst/BinarySearchTree.java'}
package edu.ncsu.csc216.searching_sorting.bst;

import java.util.NoSuchElementException;

public class BinarySearchTree {
	
	private IntTreeNode overallRoot;
	
	public BinarySearchTree() {
		overallRoot = null;
	}
	
    public void remove(int value) {
		// TODO
	}
	
	private IntTreeNode remove(IntTreeNode root, int value) {
		// TODO
		return root;
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

    public int getMin() {
		if (overallRoot == null) {
			throw new NoSuchElementException();
		}
		return getMin(overallRoot);
	}
	
	private int getMin(IntTreeNode root) {
		if (root.left == null) {
			return root.data;
		} else {
			return getMin(root.left);
		}
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

// Remove a node with no children
tree.remove(42);
assertEquals("-3 29 55 60 87 91 ", tree.inOrderTraversal());

// Remove a node with left child
tree.remove(29);
assertEquals("-3 55 60 87 91 ", tree.inOrderTraversal());

// Remove a node with two children
tree.remove(87);
assertEquals("-3 55 60 91 ", tree.inOrderTraversal());

// Remove a node with right child
tree.remove(60);
assertEquals("-3 55 91 ", tree.inOrderTraversal());

// Attempt to remove a node that doesn't exist
tree.remove(60);
assertEquals("-3 55 91 ", tree.inOrderTraversal());

// Keep removing nodes
tree.remove(55);
assertEquals("-3 91 ", tree.inOrderTraversal());

tree.remove(91);
assertEquals("-3 ", tree.inOrderTraversal());

tree.remove(-3);
assertEquals("", tree.inOrderTraversal());
```

Click on ▶, to run the tests:

```bash | {type: 'command', failed_when: 'exitCode!=0'}
mvn test -q -Dtest=BinarySearchTreeTest
```

<br>

And finally submit the google form below:

> _If you are not able to see questions below [click here](https://docs.google.com/forms/d/e/1FAIpQLSd92EWvbU5YQXWI4JMT3wyD6ufTsDf5epdlYOjPcdCeDFuNOA/viewform?hl=en_US&formkey=dDJORUdxTTBOalFHTWdmdUpQLWkyemc6MQ#gid=0) to open the form in a new tab._

<iframe src="https://docs.google.com/forms/d/e/1FAIpQLSd92EWvbU5YQXWI4JMT3wyD6ufTsDf5epdlYOjPcdCeDFuNOA/viewform?embedded=true" height="3963" frameborder="0" marginheight="0" marginwidth="0" style="width: 100%;">Loading…</iframe>
