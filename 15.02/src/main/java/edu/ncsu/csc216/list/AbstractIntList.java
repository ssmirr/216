package edu.ncsu.csc216.list;

public abstract class AbstractIntList implements IntList {

	@Override
	public void add(int value) {
		add(size(), value);
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public boolean contains(int value) {
		return indexOf(value) >= 0;
	}

}
