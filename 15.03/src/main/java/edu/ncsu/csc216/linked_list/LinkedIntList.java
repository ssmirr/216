package edu.ncsu.csc216.linked_list;

import edu.ncsu.csc216.list.IntList;

public class LinkedIntList implements IntList {
	
	private ListNode front;
	private int size;
	
	public LinkedIntList() {
		front = null;
		size = 0;
	}
	
	public void add(int value) {
		if (front == null) {
			//adding to an empty list
			front = new ListNode(value);
		} else {
			//adding to the end of an existing list
			ListNode current = front; //avoid losing list
			while (current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(value);
		}
		size++;
	}
	
	public void add(int idx, int value) {
		if (idx < 0 || idx > size) {
			throw new IndexOutOfBoundsException();
		}
		if (idx == 0) {
			//add to front of list
			front = new ListNode(value, front);
		} else {
			//inserting into an existing list
			ListNode current = front;
			//stop BEFORE index to add at
			for (int i = 0; i < idx - 1; i++) {
				current = current.next;
			}
			current.next = new ListNode(value, current.next);
		}
		size++;
	}
	
	public void addSorted(int value) {
		 if (front == null || front.data >= value) {
			 //add to front
			 front = new ListNode(value, front);
		 } else {
			 //insert middle or end of list
			 ListNode current = front;
			 while (current.next != null && current.next.data < value) {
				 current = current.next;
			 }
			 //Now add
			 current.next = new ListNode(value, current.next);
		 }
		 size++;
	}
	
	public int remove(int idx) {
		int value = 0;
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
	
	public int size() {
		return size;
	}
	
	public int get(int idx) {
		ListNode current = front;
		for (int i = 0; i < idx; i++) {
			current = current.next;
		}
		return current.data;
	}

	@Override
	public int indexOf(int value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void set(int idx, int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(int value) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private static class ListNode {
		
		public int data;
		public ListNode next;
		
		public ListNode(int data) {
			this(data, null);
		}
		
		public ListNode(int data, ListNode next) {
			this.data = data;
			this.next = next;
		}
	}

}
