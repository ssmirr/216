# Exercise 12.04

Implement `LinkedList.get(idx)` and `LinkedList.size()` below:

```java | {type: 'file', path:'/216/src/main/java/edu/ncsu/csc216/linked_list/LinkedList.java'}
package edu.ncsu.csc216.linked_list;

import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.ncsu.csc216.list.AbstractList;

public class LinkedList<E> extends AbstractList<E> {
	private ListNode front;
	private int size;

	public LinkedList() {
		front = null;
		size = 0;
	}

	@Override
	public void add(int idx, E value) {
		// TODO
	}

	@Override
	public E get(int idx) {
		ListNode current = front;
		for (int i = 0; i < idx; i++) {
			current = current.next;
		}
		return current.data;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public int indexOf(E value) {
		// Auto-generated method stub
		return 0;
	}

	@Override
	public E remove(int idx) {
		E value = null;
		if (front == null) {
			throw new IndexOutOfBoundsException();
		}
		if (idx == 0) {
			value = front.data;
			front = front.next;
		} else {
			ListNode current = front;
			int i = 0;
			while (current.next != null && i < idx-1) {
				current = current.next;
				i++;
			}
			if (current.next == null) {
				throw new IndexOutOfBoundsException();
			}
			value = current.next.data;
			current.next = current.next.next;
		}
		size--;
		return value;
	}

	@Override
	public void set(int idx, E value) {
		// Auto-generated method stub
		
	}

	@Override
	public Iterator<E> iterator() {
		return new LinkedIterator();
	}
	private class ListNode {
		
		public E data;
		public ListNode next;
		
		public ListNode(E data) {
			this(data, null);
		}
		
		public ListNode(E data, ListNode next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private class LinkedIterator implements Iterator<E> {
		private ListNode current;
		
		public LinkedIterator() {
			current = front;
		}
		
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public E next() {
			if (current == null) {
				throw new NoSuchElementException();
			}
			E result = current.data;
			current = current.next;
			return result;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
```

Here are some tests to verify your implementation:

```java
@Test
public void testAdd() {
    LinkedList<String> list = new LinkedList<String>();
    list.add(0, "Hello");
    list.add(1, "CSC");
    list.add(2, "216");
    assertEquals("Hello", list.get(0));
    assertEquals("CSC", list.get(1));
    assertEquals("216", list.get(2));
}
```

Click on ▶, to run the tests:

```bash | {type: 'command', failed_when: 'exitCode!=0'}
mvn test -q -Dtest=LinkedListAddTest
```
