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

	public E get(int idx) {
		// TODO

		return (E) null;
	}

	public int size() {
		// TODO

		return 0;
	}

	public void add(int idx, E value) {
		// Placeholder
	}

	public int indexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}

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

	public void set(int idx, E value) {
		// TODO Auto-generated method stub
		
	}

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
		
		public boolean hasNext() {
			return current != null;
		}

		public E next() {
			if (current == null) {
				throw new NoSuchElementException();
			}
			E result = current.data;
			current = current.next;
			return result;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
		
	}


}
