# Exercise 4.04: 

If `mystery2()` method is given an ArrayList that contains `[2, 4, 6, 8, 10]`, what is in the ArrayList after execution of `mystery2()`?

You may be able to trace the program, but here is a coding playground so you can try to modify and run the code to see results ▶. Then submit the Google Form at the bottom of the page.

```java | {type: 'script'}
import java.util.ArrayList;

public class Mystery2 {
	
	public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<Integer>();
        for (int i = 2; i <= 10; i += 2) {
            values.add(i);
        } // [2, 4, 6, 8, 10]
		

        // TODO: now run mystery and check the values
        
	}
	
    public static void mystery2(ArrayList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.add(i, 42);
        }
    }
}

```

<br>

And finally submit the Google Form below:

> _If you are not able to see the Google Form below [click here](https://docs.google.com/forms/d/e/1FAIpQLSc6mdMZL92pjB7SCXvSdXs7j34uRzCTAyAw9uYZt4OYbPrxFA/viewform?usp=sf_link) to open the form in a new tab._

<iframe src="https://docs.google.com/forms/d/e/1FAIpQLSc6mdMZL92pjB7SCXvSdXs7j34uRzCTAyAw9uYZt4OYbPrxFA/viewform?embedded=true" height="3963" frameborder="0" marginheight="0" marginwidth="0" style="width: 100%;">Loading…</iframe>
