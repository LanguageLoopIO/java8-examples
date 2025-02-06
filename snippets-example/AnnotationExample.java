// Java 20: Annotation processing with best practices
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
        // Using var for local variable type inference
        var message = "Annotations are supported";
        System.out.println(message);
    }
}
/*

Certainly! Converting the given Java 8 code to Java 20 involves ensuring compliance with the latest Java standards and taking advantage of any new features or best practices. However, in this case, the code is quite simple and doesn't require much modification. Annotations, the primary feature here, have not undergone significant changes from Java 8 to Java 20.

Here is the code with some minor adjustments for best practices, such as using `var` for local variable type inference, which was introduced in Java 10 and enhanced in later versions:



### Key Points:
1. **Annotations**: No changes were necessary as annotations are supported in the same way in Java 20.
2. **Local Variable Type Inference (`var`)**: Introduced in Java 10, `var` is used to infer the type of the local variable `message` in the `main` method. This makes the code cleaner and more concise.
3. **Best Practices**: Using `var` where appropriate is a best practice that improves readability and maintainability of the code.

This code adheres to Java 20 standards and best practices, ensuring it is both modern and efficient.
*/