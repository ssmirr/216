package edu.ncsu.csc216.list;

public interface IntList {
	
	void add(int value);
	void add(int idx, int value);
	int get(int idx);
	int indexOf(int value);
	boolean isEmpty();
	int remove(int idx);
	void set(int idx, int value);
	int size();
	boolean contains(int value);

}
