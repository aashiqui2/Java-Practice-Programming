Yes, the code you shared checks for the square root by finding a number (`div`) such that:

```java
no / div == div
```

This only works **for perfect squares**. Here's a few **other ways to find the square root** in Java **without using built-in functions** like `Math.sqrt()`:

---

### ✅ **Method 1: Binary Search (Efficient for Perfect/Integer Square Roots)**

```java
public class SquareRootBinarySearch {

    public static int squareRoot(int no) {
        int start = 1, end = no, result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid == no / mid) { // avoid mid * mid
                return mid;
            } else if (mid < no / mid) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }
        return result; // For non-perfect squares, this gives the floor of sqrt
    }

    public static void main(String[] args) {
        int no = 25;
        System.out.println("Square root of " + no + " is " + squareRoot(no));
    }
}
```

---

### ✅ **Method 2: Repeated Subtraction (Only for perfect squares, educational)**

Mathematical trick:
Subtract odd numbers from the number until you reach 0. The count of subtractions gives the square root.

```java
public class SquareRootSubtraction {
    public static int squareRoot(int no) {
        int i = 1;
        int count = 0;
        while (no > 0) {
            no -= i;
            i += 2;
            count++;
        }
        return no == 0 ? count : -1; // returns -1 if not a perfect square
    }

    public static void main(String[] args) {
        int no = 25;
        int result = squareRoot(no);
        if (result != -1)
            System.out.println("Square root of " + no + " is " + result);
        else
            System.out.println(no + " is not a perfect square");
    }
}
```

---

### ✅ **Method 3: Newton-Raphson Method (For approximate square root)**

```java
public class SquareRootNewton {

    public static double squareRoot(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.0001) // precision check
                break;
            x = root;
        }
        return root;
    }

    public static void main(String[] args) {
        double no = 25;
        System.out.printf("Square root of %.0f is %.5f\n", no, squareRoot(no));
    }
}
```

---

### Summary:

| Method               | Perfect Square Only | Approximate Root    | Fast |
| -------------------- | ------------------- | ------------------- | ---- |
| Division method      | ✅                   | ❌                   | ❌    |
| Binary search        | ✅                   | ❌ (unless modified) | ✅    |
| Repeated subtraction | ✅                   | ❌                   | ❌    |
| Newton-Raphson       | ❌                   | ✅                   | ✅✅   |

Let me know which one you'd like explained further or converted for floats/doubles!
