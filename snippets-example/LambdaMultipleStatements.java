// Java 20: Using modern features and best practices
public class LambdaMultipleStatements {
    public static void main(String[] args) {
        // Use of var for local variables (introduced in Java 10 for type inference)
        var run = (Runnable) () -> {
            System.out.println("First statement");
            System.out.println("Second statement");
        };

        // Explicitly calling the run method
        run.run();
    }
}


/*

To convert the provided Java 8 code to Java 20, we can modernize it by incorporating the latest features and improvements in Java 20 while adhering to best practices. However, since the original code is already functional, the changes will focus on enhancing readability, maintainability, and utilizing modern constructs where applicable.

Here’s the updated code for Java 20:



### Key Updates and Best Practices:
1. **`var` for Local Variables**:
   - Introduced in Java 10, `var` allows type inference for local variables, making the code more concise and modern.
   - The explicit `(Runnable)` cast ensures clarity about the functional interface being implemented.

2. **Code Readability**:
   - Even though there isn’t much to improve in the original example, `var` usage enhances modern Java style.

3. **Modern Java Features**:
   - Since Java 20 does not introduce specific changes related to lambdas or `Runnable`, the code remains largely unchanged in functionality but adopts modern conventions.

### Notes:
- This example demonstrates a simple lambda expression, and the improvements are subtle due to the simplicity of the original code.
- For more complex scenarios, features like `sealed classes`, `record classes`, pattern matching, or other modern Java features introduced in versions 9–20 may be applicable.
*/