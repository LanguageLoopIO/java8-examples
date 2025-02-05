// Java 20: Files and NIO with Best Practices
import java.nio.file.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class NIOExample {
    public static void main(String[] args) {
        Path path = Path.of("sample.txt"); // Using Path.of() instead of Paths.get()
        String content = "Hello, NIO!";

        try {
            Files.writeString(path, content, StandardCharsets.UTF_8); // Using Files.writeString() for simplicity
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace(); // For debugging purposes
        }
    }
}
/*

To convert the provided Java 8 code to Java 20, we can leverage several modern Java features and best practices. However, the core functionality of writing to a file using NIO remains largely unchanged. Here is the updated code with some best practices and considerations for Java 20:



### Explanation of Changes:

1. **Path.of() vs. Paths.get()**: 
   - In Java 11, `Path.of()` was introduced as a more concise way to create a `Path` object compared to `Paths.get()`. Although the functionality is the same, `Path.of()` is preferred in newer versions of Java for its brevity.

2. **Files.writeString()**:
   - Introduced in Java 11, `Files.writeString()` simplifies the process of writing a string to a file. It eliminates the need to manually convert the string to bytes and handle character encoding explicitly.

3. **Exception Handling**:
   - The code now uses a try-catch block to handle `IOException` gracefully. This is a best practice to ensure that the program can handle errors without crashing and provides meaningful feedback.

4. **Character Encoding**:
   - Specifying `StandardCharsets.UTF_8` ensures that the file content is written with UTF-8 encoding, which is a common and safe choice for text files.

By adopting these practices, the code remains clean, efficient, and compliant with modern Java standards.
*/