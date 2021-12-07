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
