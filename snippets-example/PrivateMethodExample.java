interface MyInterface {
    // Private method in the interface (Java 9+ feature)
    private void privateMethod() {
        System.out.println("Private method in interface");
    }

    // Default method that calls the private method
    default void defaultMethod() {
        privateMethod();
    }
}

public class PrivateMethodExample implements MyInterface {
    public static void main(String[] args) {
        // Using a record to encapsulate the instance creation for modern Java syntax
        record ExampleRunner(MyInterface instance) {
            void run() {
                instance.defaultMethod();
            }
        }

        // Create an instance and invoke the default method
        ExampleRunner runner = new ExampleRunner(new PrivateMethodExample());
        runner.run();
    }
}


/*

The code provided is already compatible with Java 9 and later versions, as private methods in interfaces were introduced in Java 9. However, since you want this code converted to Java 20, I'll ensure it leverages modern features and best practices available in Java 20 while retaining the same functionality.

Java 20 does not bring specific changes to private methods in interfaces but offers enhanced features like `Record` classes, `Pattern Matching`, `Sealed Classes`, and more. Although these features aren't directly applicable here, I'll refactor the code slightly to ensure modern syntax and practices are used, where applicable.

Below is your updated code for Java 20:

### Updated Java 20 Code:


### Explanation of Changes:
1. **Use of `record`**:
   - Introduced a `record` (`ExampleRunner`) to encapsulate the instance of `MyInterface` and its usage. Records are a modern Java feature (introduced in Java 14 and finalized in Java 16) that provide a concise way to create immutable data classes.

2. **Modern Syntax**:
   - Simplified the creation and invocation of the `PrivateMethodExample` instance using a `record`.

3. **Readability and Modularity**:
   - Encapsulated the logic in the `ExampleRunner` record to make the main method cleaner and more modular.

This code now reflects modern Java practices while maintaining compatibility with Java 20 features.
*/