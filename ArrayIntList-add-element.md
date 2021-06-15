# Exercise 12.02

Implement `ArrayIntList.add(element)` below, and click on the ✏ icon on top right corner:

```java | {type: 'file', path:'/216/src/main/java/edu/ncsu/csc216/array_list/ArrayIntList.java'}
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

}
```

Here are some tests to verify your implementation:

```java
@Test
public void testAdd() {
    ArrayIntList list = new ArrayIntList();
    assertEquals(0, list.size());
    list.add(3);
    assertEquals(1, list.size());
    assertEquals(3, list.get(0));
}
```

Click on ▶, to run the tests:

```bash | {type: 'command', failed_when: 'exitCode!=0'}
mvn test -q -Dtest=ArrayIntListTest#testAdd
```
