package edu.ncsu.csc216.list;

public abstract class AbstractList<E> implements List<E> {

	/* (non-Javadoc)
	 * @see edu.ncsu.csc216.list.List#add(java.lang.Object)
	 */
	@Override
	public void add(E value) {
		add(size(), value);
	}

	/* (non-Javadoc)
	 * @see edu.ncsu.csc216.list.List#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	/* (non-Javadoc)
	 * @see edu.ncsu.csc216.list.List#contains(java.lang.Object)
	 */
	@Override
	public boolean contains(E value) {
		return indexOf(value) >= 0;
	}
	
}
