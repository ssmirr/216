package edu.ncsu.csc216.list;

import edu.ncsu.csc216.array_list.ArrayIntList;
import edu.ncsu.csc216.array_list.ArrayList;
import edu.ncsu.csc216.linked_list.LinkedIntList;
import edu.ncsu.csc216.linked_list.LinkedList;

public class ListMain {
	
	public static void process(IntList list) {
		list.add(18);
		list.add(27);
		list.add(93);
		print(list);
		list.remove(1);
		print(list);
	}
	
	public static void print(IntList list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void process(List<Integer> list) {
		list.add(18);
		list.add(27);
		list.add(93);
		print(list);
		list.remove(1);
		print(list);
	}
	
	public static void print(List<Integer> list) {
		for (Integer i: list) {
			System.out.print(i.intValue() + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		IntList list1 = new ArrayIntList();
		process(list1);
		
		IntList list2 = new LinkedIntList();
		process(list2);
		
		List<Integer> list3 = new ArrayList<Integer>();
		process(list3);
		
		List<Integer> list4 = new LinkedList<Integer>();
		process(list4);
	}

}
