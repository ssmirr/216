# Exercise 4.03: 

If `mystery1()` method is given an ArrayList that contains `[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]`

what is in the ArrayList after execution of `mystery1()`?

You should be able to trace this Here is a coding playground, you can modify and run it ▶. Then submit the Google Form at the bottom of the page.

```java | {type: 'script'}
import java.util.ArrayList;

public class Mystery1 {
	
	public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<Integr>();
        for (int i = 10; i <= 100; i += 10) {
            values.add(i);
        } // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		

        // TODO: now run mystery and check the values

	}

    public void mystery1(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
    }
	
}

```

<br>

And finally submit the Google Form below:

> _If you are not able to see the Google Form below [click here](https://docs.google.com/forms/d/e/1FAIpQLSdYBAWHgQYHPgG_d99oQGZ10VOPJjWZJ50pEV4Lli7bIMYugw/viewform?usp=sf_link) to open the form in a new tab._

<iframe src="https://docs.google.com/forms/d/e/1FAIpQLSdYBAWHgQYHPgG_d99oQGZ10VOPJjWZJ50pEV4Lli7bIMYugw/viewform?embedded=true" height="3963" frameborder="0" marginheight="0" marginwidth="0" style="width: 100%;">Loading…</iframe>