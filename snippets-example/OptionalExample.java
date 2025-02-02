// Java 8: Using Optional
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable("John");
        System.out.println(name.orElse("Default Name"));
    }
}
