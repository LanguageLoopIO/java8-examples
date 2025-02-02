// Java 8: Annotation processing
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
}

public class AnnotationExample {
    @MyAnnotation(value = "Hello Annotation")
    public void myMethod() {
        // Method implementation
    }

    public static void main(String[] args) {
        System.out.println("Annotations are supported");
    }
}
