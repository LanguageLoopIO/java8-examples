// Java 20: Lambda with multiple statements, with modern best practices
public class LambdaMultipleStatements {
    public static void main(String[] args) {
        // Using local variable for better readability and potential optimizations
        Runnable run = () -> {
            printStatement("First statement");
            printStatement("Second statement");
        };
        
        run.run();
    }

    // Encapsulating repeated code into a method for better maintainability and readability
    private static void printStatement(String statement) {
        System.out.println(statement);
    }
}
/*

Certainly! Here is the Java 8 code converted to Java 20 with best practices in performance, security, compliance, and modern Java features:



### Explanation of Changes and Best Practices Applied:

1. **Encapsulation**: 
   - The repeated `System.out.println()` calls are encapsulated into a separate method `printStatement()`. This practice improves maintainability and readability. If the logic for printing needs to change in the future, it only needs to be updated in one place.

2. **Code Readability**:
   - The code is formatted in a clean, readable manner. Comments are added to explain the purpose of the code blocks.

3. **Modern Practices**:
   - While the core functionality remains the same, the method encapsulation reflects a modern approach to code organization and best practices.

4. **Performance and Security**:
   - There are no inherent performance or security issues in this simple example, but the practice of encapsulating logic into methods can help prevent errors and improve security in more complex applications by reducing code duplication and improving testability.

5. **Compliance**:
   - This code is fully compliant with Java 20 standards. The `Runnable` interface and lambda expressions have been part of Java since Java 8, so no additional compliance issues arise from using them in Java 20.

This refactored code adheres to best practices and is ready to be used in a Java 20 environment.
*/