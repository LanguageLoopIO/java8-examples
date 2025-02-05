// Java 20: Using Optional with modern best practices
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Use of Optional.ofNullable remains the same as it is appropriate for nullable values
        Optional<String> name = Optional.ofNullable("John");

        // Using ifPresentOrElse to handle both presence and absence of a value
        name.ifPresentOrElse(
            System.out::println,  // Action if value is present
            () -> System.out.println("Default Name")  // Action if value is absent
        );

        // Alternatively, if you still want to use orElse, it remains valid
        // System.out.println(name.orElse("Default Name"));
    }
}
/*

Sure, let's convert the given Java 8 code to Java 20, while adhering to best practices and taking advantage of modern Java features. In this specific example, the code is already quite clean and leverages Java 8's `Optional` effectively. However, in Java 20, there are some enhancements and best practices we can consider.

Here's the updated code:



### Key Changes and Best Practices:
1. **Use of `ifPresentOrElse`**: This method was introduced in Java 9 and provides a more explicit way to handle both the presence and absence of a value within an `Optional`. It avoids unnecessary computations or side effects that might occur with `orElse`.

2. **Method References**: The `System.out::println` is a method reference, which is a more concise and readable way to pass a lambda expression that simply calls an existing method.

3. **Comments**: Comments are added to explain the choices made, which is a good practice for maintainability.

4. **Security and Compliance**: The code remains free of security vulnerabilities. However, always ensure that the data being handled by `Optional` is validated and sanitized if it comes from an untrusted source.

5. **Performance**: The use of `ifPresentOrElse` can be more performant than `orElse` in scenarios where the "absent" action involves a costly computation or side effect.

By following these practices, the code is not only modern but also prepared for future Java versions and best practices.
*/