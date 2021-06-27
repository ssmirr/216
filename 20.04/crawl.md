# Exercise 20.04

Write a method `crawl` that accepts a `File` parameter and prints information about that file.
- if the `File` object represents a normal file, just print its name.
- if the `File` object represents a directory, print its name and information about every file/directory inside it, indented.

```
216
    pom.xml
    15.02
        src
            ...
        test
            ...
        pom.xml
        LinkedList-get-size.md
    20.04
        crawl.md
    ...
```

See Java documentation for `java.io.File` [here](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#method.summary).

---

The tricky part of doing this is that we cannot vary the indentation without an extra parameter `indent`:

``` java
private static void crawl(File f, String indent) {
```

But this `indent` parameter that we need for our recursion does not match the parameters that client will want to pass. So in this case, we instead write a pair of methods:

- a _public_, non-recursive one with the parameters the client wants:
``` java
public static void crawl(File f) {
```

- a _private_, recursive one with the parameters that we need:
``` java
private static void crawl(File f, String indent) {
```

---


Write the public/private method pairs for the crawl method.

```java | {type: 'script'}
import java.io.File;

class Exercise {

    public static void crawl(File f) {
        // TODO
        
    }


    private static void crawl(File f, String indent) {
        // TODO

    }

    public static void main(String[] args) {
        crawl(new File("/216/15.02"));
    }

}
```


<br>

Submit your code below:

> _If you are not able to see the form below [click here](https://docs.google.com/forms/d/e/1FAIpQLSeoiH1eI2mz7LarmCpFOoiKwZ322bL6dMsP_f293BkTVZ-igQ/viewform?hl=en_US&formkey=dHdJc21VenFMN2lUbEJ4NE4zem9hYkE6MQ#gid=0) to open it in a new tab._

<iframe src="https://docs.google.com/forms/d/e/1FAIpQLSeoiH1eI2mz7LarmCpFOoiKwZ322bL6dMsP_f293BkTVZ-igQ/viewform?embedded=true" height="3963" frameborder="0" marginheight="0" marginwidth="0" style="width: 100%;">Loading…</iframe>
