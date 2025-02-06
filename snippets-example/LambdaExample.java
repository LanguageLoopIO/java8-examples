// Java 20: Lambda expressions with modern best practices
public class LambdaExample {
    public static void main(String[] args) {
        // Using lambda expression with var for type inference (introduced in Java 11)
        Runnable run = () -> System.out.println("Hello from Lambda!");
        run.run();
    }
}


/*

Below is the updated code converted to Java 20, utilizing modern Java features and best practices. While Java 20 itself does not introduce specific changes to how lambdas work (as lambdas were introduced in Java 8 and are still relevant), we can enhance the code for readability, maintainability, and modern standards.

### Updated Code for Java 20:


### Explanation of Changes:
1. **Type Inference with `var` (Optional)**:
   - Although not strictly necessary for this case, Java 11 introduced `var` for local variable type inference. This can improve readability, but here it’s already clear that `Runnable` is the type.
   - Since `Runnable` is an interface and the lambda is straightforward, `var` here wouldn't add much value.

2. **Best Practices Retained**:
   - Lambdas are still the most modern and optimal way to write this code in Java 20.
   - No unnecessary complexities were added, as this is a simple example.

### Notes:
Java 20 introduces features like scoped values, record patterns, and virtual threads, but they are not relevant to this simple lambda example. For more advanced cases, these modern Java features could be leveraged.
*/