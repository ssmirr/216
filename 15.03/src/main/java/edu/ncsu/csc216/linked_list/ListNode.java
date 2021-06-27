package edu.ncsu.csc216.linked_list;

public class ListNode {
	
	int data;
	ListNode next;
	
	public ListNode(int data) {
		this(data, null);
	}
	
	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}
	
	public static void printList(ListNode list) {
		ListNode current = list;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void manipulatingNodes() {
		ListNode list = new ListNode(10);
		list.next = new ListNode(20);
		list.next.next = new ListNode(30);
		
		printList(list);		
		
		ListNode temp = new ListNode(40);
		temp.next = new ListNode(50);
		temp.next.next = new ListNode(60);
		
		printList(temp);
		
		list.next.next.next = temp.next.next; //30 -> 60
		temp.next = list.next; //40 -> 20
		list.next = temp; //10 -> 40
		
		printList(list);
	}
	
	/**
	 * Adds the given data to the end of the given
	 * list.
	 * @param list add data to end of list
	 * @param data data to add to end of list 
	 */
	public static void add(ListNode list, int data) {
		while (list != null) {
			list = list.next;
		}
		
		list.next = new ListNode(data);
	}
	
	public static void main(String [] args) {
//		manipulatingNodes();

		ListNode list = new ListNode(10); 
		list.next = new ListNode(20);   
		list.next.next = new ListNode(30);
		
		add(list, 3);
	}   

}
