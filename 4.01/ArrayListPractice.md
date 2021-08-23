# Exercise 4.01:

Write methods that will manipulate an `ArrayList` of `Strings`.

- Reverse the content of the list

```java | {type: 'script'}
import java.util.ArrayList;

public class ArrayListExercise {
	
    public static void reverse(ArrayList<String> list) {
        // implement method here

    }
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
        list.add("lets");
        list.add("transform");
        list.add("the");
        list.add("elements");
        list.add("in");
        list.add("this");
        list.add("ArrayList");
		
        System.out.println("Array before reverse(): [ " + String.join(", ", list) + " ]");
        reverse(list);
        System.out.println("Did you reverse elements in the ArrayList correctly? [ " + String.join(", ", list) + " ]");
	}
}
```

<br>

- Remove elements that end in `s`.


```java | {type: 'script'}
import java.util.ArrayList;

public class ArrayListExercise {
	
    public static void removeS(ArrayList<String> list) {
        // implement method here

    }
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
        list.add("lets");
        list.add("transform");
        list.add("the");
        list.add("elements");
        list.add("in");
        list.add("this");
        list.add("ArrayList");
		
        // printing array
        System.out.println("ArrayList before removeS(): [ " + String.join(", ", list) + " ]");
        removeS(list);
        System.out.println("Did you remove all elements ending with 's'? [ " + String.join(", ", list) + " ]");
	}
}
```

- Transform the lines that end with `s` to all upper case.


```java | {type: 'script'}
import java.util.ArrayList;

public class ArrayListExercise {
	
    public static void upperS(ArrayList<String> list) {
        // implement method here
        
    }
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
        list.add("lets");
        list.add("transform");
        list.add("the");
        list.add("elements");
        list.add("in");
        list.add("this");
        list.add("ArrayList");
		
        // printing array
        System.out.println("ArrayList before upperS(): [ " + String.join(", ", list) + " ]");
        removeS(list);
        System.out.println("Did you make all elements ending with 's' to all upper case? [ " + String.join(", ", list) + " ]");
	}
}
```

And finally submit the google form below:

> _If you are not able to see questions below [click here](https://docs.google.com/forms/d/e/1FAIpQLSfBW3E0SJJHaRXf-FN9Qo0YPIxrwGS8SgptLWGyBQv3aY6EpA/viewform?usp=sf_link) to open the form in a new tab._

<iframe src="https://docs.google.com/forms/d/e/1FAIpQLSfBW3E0SJJHaRXf-FN9Qo0YPIxrwGS8SgptLWGyBQv3aY6EpA/viewform?embedded=true" height="3963" frameborder="0" marginheight="0" marginwidth="0" style="width: 100%;">Loading…</iframe>
