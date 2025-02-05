import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // Using List.of() to create an immutable list
        var numbers = List.of(1, 2, 3, 4, 5);
        
        // Processing the stream with best practices
        var squaredEvens = numbers.stream()
                                  .filter(n -> n % 2 == 0)
                                  .map(n -> n * n)
                                  .collect(Collectors.toList());
        
        // Printing the results
        squaredEvens.forEach(System.out::println);
    }
}
/*

Certainly! The provided Java 8 code already uses the Stream API, which is also available in Java 20. However, we can make some improvements using features and best practices available in Java 20, such as using `List.of()` for immutable lists and leveraging `var` for local variable type inference.

Here's the updated code in Java 20:



### Key Changes and Best Practices Applied:

1. **Immutable List**: `List.of(...)` is used to create an immutable list. This is a best practice because immutable lists are more predictable and can be shared across threads without synchronization issues.

2. **`var` for Local Variables**: The `var` keyword is used for local variable type inference, which makes the code more concise and readable. It should be used judiciously to maintain clarity.

3. **Collecting Results**: The results of the stream operations are collected into a list using `collect(Collectors.toList())`. This allows you to reuse the results if needed, rather than directly printing them in the stream pipeline.

4. **Printing the Results**: The results are printed separately from the stream operations, which enhances readability and separates concerns (processing vs. output).

These changes ensure that the code is up-to-date with Java 20 best practices while maintaining clarity and performance.
*/