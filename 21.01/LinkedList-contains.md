# Exercise 21.01

Implement `LinkedIntList.contains()` below and then submit the Google Form at the bottom of the page. 

Note: Method must be written using recursion, in `LinkedIntList.contains(int value)` and `ListNode.contains(ListNode current, int value)`.

```java | {type: 'file', path:'/216/21.01/src/main/java/edu/ncsu/csc216/list/LinkedIntList.java'}
package edu.ncsu.csc216.lists;

public class LinkedIntList {
	
	private ListNode front;
	
	public LinkedIntList() {
		this(null);
	}
	
	private LinkedIntList(ListNode front) {
		this.front = front;
	}
	
	public int countPositive() {
		return 0;
	}
	
	public boolean contains(int value) {
        // TODO
		return false;
	}
	
	public boolean recursiveAdd(int value) {
		return false;
	}
	
	public void recursiveAdd(int idx, int value) {
		
	}
	
	public boolean recursiveRemove(int value) {
		return false;
	}
	
	public boolean add(int value) {
		if (front == null) {
			front = new ListNode(value);
			return true;
		} else {
			ListNode cur = front;
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = new ListNode(value);
			return true;
		}
	}

	private class ListNode {
		public int data;
		public ListNode next;
		
		public ListNode() {
			this(0);
		}
		
		public ListNode(int data) {
			this(data, null);
		}
		
		public ListNode(int data, ListNode next) {
			this.data = data;
			this.next = next;
		}
		
		public boolean contains(ListNode current, int value) {
            // TODO
			return false;
		}
		
		public boolean add(int value) {
			return false;
		}
		
		public void add(int idx, int value) {
			
		}
		
		public boolean remove(int value) {
			return false;
		}
	}

}
```

Here are some tests to verify your implementation:

```java
private LinkedIntList l = new LinkedIntList();
l.add(4); l.add(-7); l.add(23); l.add(-1);

assertTrue(l.contains(4));
assertFalse(l.contains(42));
```

Click on ▶, to run the tests:

```bash | {type: 'command', failed_when: 'exitCode!=0'}
mvn test -q -Dtest=LinkedIntListTest
```

<br>

And finally submit the google form below:

<iframe src="https://docs.google.com/forms/d/e/1FAIpQLSfCVOB5gIJwMIDjsOQdUmgcGp25zImGAmqDhC25hEzr5P0ojQ/viewform?embedded=true" height="3963" frameborder="0" marginheight="0" marginwidth="0" style="width: 100%;">Loading…</iframe>
