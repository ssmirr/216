package edu.ncsu.csc216.list;

import java.util.Iterator;

public interface List<E> extends Iterable<E> {
	void add(E value);
	void add(int idx, E value);
	E get(int idx);
	int indexOf(E value);
	boolean isEmpty();
	E remove(int idx);
	void set(int idx, E value);
	int size();
	boolean contains(E value);
	Iterator<E> iterator();
}
