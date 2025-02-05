// Java 20: Refactored with best practices
interface MyInterface {
    private void privateMethod() {
        System.out.println("Private method in interface");
    }

    default void defaultMethod() {
        privateMethod();
    }
}

public class PrivateMethodExample implements MyInterface {
    public static void main(String[] args) {
        var example = new PrivateMethodExample();
        example.defaultMethod();
    }
}
/*

The provided code already uses a feature introduced in Java 9, which is the ability to have private methods in interfaces. Since Java 20 does not introduce any new features that directly affect this code, we will focus on ensuring compliance with best practices in Java 20, including performance, security, and modern Java features.

Here are some best practices we can apply:

1. **Use Text Blocks**: If you have multi-line strings, use text blocks for better readability.
2. **Use Records**: If the class does not need to be mutable or does not require complex behavior, consider using records.
3. **Use Local-Variable Syntax for Lambda Parameters**: Introduced in Java 10, this feature can be used to make the code cleaner.
4. **Use `var` for Local Variables**: Introduced in Java 10, this can make the code more concise where the type is obvious.
5. **Use Switch Expressions**: Introduced in Java 12, this can be used for cleaner and more concise switch statements.
6. **Use Pattern Matching for `instanceof`**: Introduced in Java 16, this can simplify code that involves `instanceof` checks.
7. **Use Sealed Classes**: Introduced in Java 15, this can be used to restrict which classes can extend a sealed class.

However, since the provided code is quite simple and doesn't really benefit from these newer features, we will focus on ensuring the code is clean and follows modern conventions. Here is the code refactored with some best practices:



### Explanation:
- **Use of `var`**: The `var` keyword is used to infer the type of the `example` variable, making the code more concise.
- **Code Formatting**: The code is formatted for better readability.

This code is already leveraging the Java 9 feature of private methods in interfaces and adheres to modern Java best practices where applicable. No further changes are necessary to fully utilize Java 20 features, as they are not relevant to this specific piece of code.
*/