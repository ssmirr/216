# Exercise 26.03

Write the `contains` method that returns true if the given integer is in the BST.

Assume the `contains` method belongs to a SearchTree class that has a pointer to the root node. You should write a public/private pair.

```java | {type: 'file', path: '/216/26.03/src/main/java/edu/ncsu/csc216/searching_sorting/bst/BinarySearchTree.java'}
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

assertTrue(tree.contains(29));
assertTrue(tree.contains(55));
assertFalse(tree.contains(63));
assertFalse(tree.contains(35));
```

Click on ▶, to run the tests:

```bash | {type: 'command', failed_when: 'exitCode!=0'}
mvn test -q -Dtest=BinarySearchTreeTest
```

<br>

And finally submit the google form below:

> _If you are not able to see questions below [click here](https://docs.google.com/forms/d/e/1FAIpQLSfnepqDsR3QPSXyUh7cS2RhJMzDzbp5FB3xCpCq55vFccwYww/viewform?hl=en_US&formkey=dDJORUdxTTBOalFHTWdmdUpQLWkyemc6MQ#gid=0) to open the form in a new tab._

<iframe src="https://docs.google.com/forms/d/e/1FAIpQLSfnepqDsR3QPSXyUh7cS2RhJMzDzbp5FB3xCpCq55vFccwYww/viewform?embedded=true" height="3963" frameborder="0" marginheight="0" marginwidth="0" style="width: 100%;">Loading…</iframe>
