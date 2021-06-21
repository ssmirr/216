package edu.ncsu.csc216.list;

public abstract class AbstractIntList implements IntList {

	public void add(int value) {
		add(size(), value);
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean contains(int value) {
		return indexOf(value) >= 0;
	}

}
