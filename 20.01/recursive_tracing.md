# Exercise 20.01

Consider `mystery` and `mystery2` methods below:

```java | {type: 'script'}
class Exercise {
    public static void main(String[] args) {
        
    }

    public static int mystery(int n) {
        if (n < 10) {
            return n;
        } else {
            int a = n / 10;
            int b = n % 10;
            return mystery(a + b);
        }
    }

    public static int mystery2(int n) {
        if (n < 10) {
            return (10 * n) + n;
        } else {
            int a = mystery2(n / 10);
            int b = mystery2(n % 10);
            return (100 * a) + b;
        }
    }
}
```

<br>

Answer the following questions about this client code:

> _If you are not able to see questions below [click here](https://docs.google.com/forms/d/e/1FAIpQLSfOs1bJ_GafOmzg8mk3n_9QTE13ct-soamB_lUlx6QPiw4P3Q/viewform?hl=en_US&formkey=dDJORUdxTTBOalFHTWdmdUpQLWkyemc6MQ#gid=0) to open the form in a new tab._

<iframe src="https://docs.google.com/forms/d/e/1FAIpQLSfOs1bJ_GafOmzg8mk3n_9QTE13ct-soamB_lUlx6QPiw4P3Q/viewform?embedded=true" height="3963" frameborder="0" marginheight="0" marginwidth="0" style="width: 100%;">Loading…</iframe>
