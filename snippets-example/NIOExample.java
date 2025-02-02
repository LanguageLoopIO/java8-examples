// Java 8: Files and NIO
import java.nio.file.*;
import java.io.IOException;

public class NIOExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("sample.txt");
        Files.write(path, "Hello, NIO!".getBytes());
    }
}
