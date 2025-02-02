// Java 8: Constructor references
import java.util.function.*;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Supplier<StringBuilder> supplier = StringBuilder::new;
        StringBuilder sb = supplier.get();
        sb.append("Constructor Reference!");
        System.out.println(sb.toString());
    }
}
