# Exercise 19.01

The following _client_ code is particularly slow on linked lists:

```java
List<Integer> list = new LinkedList<Integer>();

for (int i = 0; i < list.size(); i++) {
    int value = list.get(i);
    if (value % 2 == 1) {
        list.remove(i);
    }
}
```

And as a reminder here is how our LinkedList implementation works:

```java
public class LinkedList<E> extends AbstractList<E> {
	private ListNode front;
	private int size;

	public LinkedList() {
		front = null;
		size = 0;
	}

	@Override
	public E get(int idx) {
		ListNode current = front;
		for (int i = 0; i < idx; i++) {
			current = current.next;
		}
		return current.data;
	}

    @Override
	public E remove(int idx) {
		E value = null;
		if (front == null) {
			throw new IndexOutOfBoundsException();
		}
		if (idx == 0) {
			value = front.data;
			front = front.next;
		} else {
			ListNode current = front;
			int i = 0;
			while (current.next != null && i < idx-1) {
				current = current.next;
				i++;
			}
			if (current.next == null) {
				throw new IndexOutOfBoundsException();
			}
			value = current.next.data;
			current.next = current.next.next;
		}
		size--;
		return value;
	}
}
```

<br>

Answer the following questions about this client code:

> _If you are not able to see questions below [click here](https://docs.google.com/forms/d/e/1FAIpQLSe3woFMbuITYWlB0wGNg8lp5SFRpqt30VanB93ViXxlTZDesw/viewform?hl=en_US&formkey=dDJORUdxTTBOalFHTWdmdUpQLWkyemc6MQ#gid=0) to open the form in a new tab._

<iframe src="https://docs.google.com/forms/d/e/1FAIpQLSe3woFMbuITYWlB0wGNg8lp5SFRpqt30VanB93ViXxlTZDesw/viewform?embedded=true" height="3963" frameborder="0" marginheight="0" marginwidth="0" style="width: 100%;">Loading…</iframe>
