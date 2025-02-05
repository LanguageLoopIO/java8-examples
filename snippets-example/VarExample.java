// Java 20: Records and Switch Expressions
public class PersonExample {
    // Using record for data storage
    record Person(String name, int age) {}

    public static void main(String[] args) {
        var person = new Person("John Doe", 30);

        // Using switch expression for conditional logic
        String greeting = switch (person.age()) {
            case int a when a < 18 -> "Hello, young " + person.name() + "!";
            case int a when a >= 18 && a < 65 -> "Hello, " + person.name() + "!";
            case int a when a >= 65 -> "Hello, senior " + person.name() + "!";
            default -> "Hello, " + person.name() + "!";
        };

        System.out.println(greeting);
    }
}
/*

Since the provided code snippet is already using a feature from Java 10 (local variable type inference with `var`), it doesn't need to be changed for Java 20. However, I can provide some additional best practices and improvements that might be relevant when converting Java 8 code to Java 20.

### Best Practices for Java 20 Code:
1. **Use of `var`**: Continue using `var` for local variable type inference where it makes the code more readable.
2. **Records**: If you have classes that are immutable and primarily used to store data, consider using records for better readability and less boilerplate.
3. **Switch Expressions**: If you have switch statements, consider using switch expressions for more concise and readable code.
4. **Text Blocks**: For multi-line strings, use text blocks for better readability.
5. **Pattern Matching for `instanceof`**: If you have `instanceof` checks, use pattern matching for better readability and type safety.
6. **Scoped Values**: If you need to pass values across different threads or scopes, consider using scoped values.
7. **Virtual Threads**: For concurrency, consider using virtual threads for better performance and resource management.
8. **Sequenced Collections**: Use sequenced collections like `Seq`, `SeqMap`, and `SeqSet` for better order guarantees.
9. **Record Patterns**: If you are using records, consider using record patterns for pattern matching.
10. **Stream API Enhancements**: Use the latest enhancements in the Stream API for better performance and functionality.

### Example of Using Some of These Best Practices:

Here is an example that incorporates some of these best practices. Let's assume you have a simple class that stores a person's details and you want to print it out. We'll convert this to use a record and a switch expression.



### Explanation:
- **Record**: The `Person` class is defined as a record, which automatically generates the constructor, getters, `equals()`, `hashCode()`, and `toString()` methods.
- **Switch Expression**: The `switch` statement is used as an expression to assign a greeting message based on the person's age, providing a more concise and readable way to handle multiple conditions.

This example demonstrates some of the modern Java features that can be used in Java 20 to write cleaner and more efficient code.
*/