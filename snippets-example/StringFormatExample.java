// Java 20: String formatting using String#formatted
public class StringFormatExample {
    public static void main(String[] args) {
        String result = "Hello, %s!".formatted("World");
        System.out.println(result);
    }
}


/*

To convert the provided Java 8 code to Java 20, we can leverage the modern `String` features introduced in later Java versions, such as `String#formatted`, which is a more concise and fluent way to format strings. This was introduced in **Java 15** and is recommended over `String.format` for modern Java development.

Here's the updated code for Java 20, incorporating modern best practices:



### Key Improvements:
1. **`String#formatted`**:
   - Introduced in Java 15, `formatted` is a cleaner and more fluent way to format strings compared to the static `String.format` method.
   - It simplifies the code and eliminates the need for the `String.format` method call.

2. **Modern Best Practice**:
   - Using `String#formatted` aligns with the modern Java API evolution, making the code more concise and idiomatic.

### Why Use `formatted`?
- It's more readable and directly tied to the `String` object being formatted.
- It avoids the verbosity of the static call `String.format`.

This code is now fully aligned with Java 20 standards while maintaining readability and performance.
*/