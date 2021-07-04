# Exercise 25.03: 

Write a recursive `binarySearch` method and run your code to check the output of example in the main method ▶. Then submit the Google Form at the bottom of the page.

```java | {type: 'script'}
public class BinarySearch {
	
	public static int binarySearch(int [] data, int value) {
		// TODO
	}
	
	private static int binarySearch(int [] data, int value, int min, int max) {
		// TODO
	}
	
	public static void main(String[] args) {
		int [] data = {1, 2, 3, 5, 6, 7, 8, 9, 10};
		int idx3 = binarySearch(data, 3); 
		System.out.println("Index of 3: " + idx3);
		int idx7 = binarySearch(data, 7);
		System.out.println("Index of 7: " + idx7);
		int idx23 = binarySearch(data, 23);
		System.out.println("Index of 23: " + idx23);
		int idx4 = binarySearch(data, 4);
		System.out.println("Index of 4: " + idx4);
	}
}
```

<br>

And finally submit the google form below:

<iframe src="https://docs.google.com/forms/d/e/1FAIpQLSdWX509ct4dpfxQlUi53CzzCbl0v2TbVbHOz-8erD-G2ajbyQ/viewform?embedded=true" height="3963" frameborder="0" marginheight="0" marginwidth="0" style="width: 100%;">Loading…</iframe>
