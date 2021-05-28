# Exercise 12.02: ArrayIntList.add(element) Implementation

Implement ArrayIntList.add(element)

```java | {type: 'file', path:'./src/main/java/edu/csc216/array_list/ArrayIntList.java'}

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
	
	public ArrayIntList() {
		this(DEFAULT_SIZE);
	}
	
	public int size() {
		return size;
	}

	public void add(int value) {
		ensureCapacity(size + 1);
		list[size] = value;
		size++;
	}
	
	public void add(int idx, int value) {
		ensureCapacity(size + 1);
		for (int i = size - 1; i >= idx; i--) {
			list[i + 1] = list[i];
		}
		list[idx] = value;
		size++;
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
		int rtn = list[idx];
		for (int i = idx; i < size - 1; i++) {
			list[i] = list[i+1];
		}
		list[size-1] = 0;
		size--;
		return rtn;
	}

}

```

Then run the tests using maven to verify your implementation:

```bash | {type: 'command'}
mvn test
```
