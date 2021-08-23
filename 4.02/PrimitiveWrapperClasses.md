# Exercise 4.02:

Given an `ArrayList` of `Integer`s.

- Calculate the average of the values:

```java | {type: 'script'}
import java.util.ArrayList;

public class ArrayListExercise {
	
    public static double average(ArrayList<Integer> list) {
        // implement method here
        return 0;
    }
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(10);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(7);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(3);
		
        double avg = average(list);

        if (Double.compare(5.5, avg) == 0)
            System.out.println("Correct!");
        else
            System.out.println("The correct average for this given input is 5.5, but you got " + avg);

	}
}
```

<br>

- Print the lowest and highest number (max/min loop).

```java | {type: 'script'}
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExercise {
	
    public static void lowestHighest(ArrayList<Integer> list) {
        // implement method here
        
    }
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(10);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(7);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(3);
		
        System.out.println("ArrayList elements: " + Arrays.toString(list.toArray()));
        System.out.println("The lowest and highest element you found are: ");
        lowestHighest(list);

        System.out.println("\nDid your code find correct lowest and highest?");
	}
}
```

- Filter out even numbers.


```java | {type: 'script'}
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExercise {
	
    public static void filter(ArrayList<Integer> list) {
        // implement method here
        
    }
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(10);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(7);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(3);
		
        // printing array
        System.out.println("ArrayList before calling filter(): " + Arrays.toString(list.toArray()));
        filter(list);
        System.out.println("ArrayList after calling filter(): " + Arrays.toString(list.toArray()));
        System.out.println("\nDid you remove all the even numbers?");
	}
}
```

And finally submit the google form below:

> _If you are not able to see questions below [click here](https://docs.google.com/forms/d/e/1FAIpQLSeWXVZ7mL1qQWmxZl19fT0Tib30WZHdhPyopd0tjswccgDqbA/viewform?usp=sf_link) to open the form in a new tab._

<iframe src="https://docs.google.com/forms/d/e/1FAIpQLSeWXVZ7mL1qQWmxZl19fT0Tib30WZHdhPyopd0tjswccgDqbA/viewform?embedded=true" height="3963" frameborder="0" marginheight="0" marginwidth="0" style="width: 100%;">Loading…</iframe>
