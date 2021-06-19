package edu.ncsu.csc216.array_list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.ncsu.csc216.list.List;

public class ArrayList<E> implements List<E> {

	private static final int DEFAULT_SIZE = 10;
	private E[] list;
	private int size;
	
	@SuppressWarnings("unchecked")
	public ArrayList(int capacity) {
//		list = new int[capacity];
		list = (E[]) (new Object[capacity]);
		size = 0;
	}
	
	public ArrayList() {
		this(DEFAULT_SIZE);
	}
	
	public int size() {
		return size;
	}

	public void add(E value) {
		ensureCapacity(size + 1);
		list[size] = value;
		size++;
	}
	
	public void add(int idx, E value) {
		ensureCapacity(size + 1);
		for (int i = size - 1; i >= idx; i--) {
			list[i + 1] = list[i];
		}
		list[idx] = value;
		size++;
	}

	/**
	 * 
	 * @param idx
	 * @return
	 * @throws IndexOutOfBoundsException when index is not between 0 and size-1, inclusive
	 */
	public E get(int idx) {
		if (idx < 0 || idx >= size) {
			throw new IndexOutOfBoundsException("" + idx);
		}
		return list[idx];
	}
	
	private void ensureCapacity(int capacity) {
		if (capacity > list.length) {
			int newCapacity = list.length * 2 + 1;
			if (capacity > newCapacity) {
				newCapacity = capacity;
				
			}
			list = Arrays.copyOf(list,  newCapacity);
		}
	}

	public E remove(int idx) {
		E rtn = list[idx];
		for (int i = idx; i < size - 1; i++) {
			list[i] = list[i+1];
		}
		list[size - 1] = null;
		size--;
		return rtn;
	}

	@Override
	public int indexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void set(int idx, E value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		return false;
	}	

	@Override
	public Iterator<E> iterator() {
		return new ArrayIterator();
	}
	
	private class ArrayIterator implements Iterator<E> {

		private int idx;
		
		public ArrayIterator() {
			idx = 0;
		}
		
		@Override
		public boolean hasNext() {
			return idx < size();
		}

		@Override
		public E next() {
			idx++;
			if (idx >= size) {
				throw new NoSuchElementException();
			}
			return get(idx-1);
		}

		@Override
		public void remove() {
			ArrayList.this.remove(idx-1);
			idx--;
		}
		
	}
}
