package edu.ncsu.csc216.array_list;
import java.util.Arrays;

public class ArrayIntList {

	private static final int DEFAULT_SIZE = 10;
	private int[] list;
	private int size;
	
	public ArrayIntList(int capacity) {
		list = new int[capacity];
		size = 0;
	}

	public void add(int value) {
		// TODO
	}
	
	public ArrayIntList() {
		this(DEFAULT_SIZE);
	}
	
	public int size() {
		return size;
	}

	public int get(int idx) {
		if (idx < 0 || idx >= size) {
			throw new IndexOutOfBoundsException();
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

    public int remove(int idx) {
        // placeholder...
        return idx;
    }

}
