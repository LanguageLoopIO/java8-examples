// Java 20: Annotation processing with best practices

import java.lang.annotation.*;

/**
 * Annotation to mark methods with a custom string value.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)  // Specify that this annotation can be used only on methods
@Documented
public @interface MyAnnotation {
    /**
     * The value associated with this annotation.
     * @return the value
     */
    String value();
}

public class AnnotationExample {

    /**
     * Example method annotated with MyAnnotation.
     */
    @MyAnnotation(value = "Hello Annotation")
    public void myMethod() {
        // Method implementation
    }

    /**
     * Main method to demonstrate the use of annotations.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Annotations are supported");
        
        // Reflectively accessing the annotation
        try {
            AnnotationExample example = new AnnotationExample();
            Method method = example.getClass().getMethod("myMethod");
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            
            if (annotation != null) {
                System.out.println("Annotation value: " + annotation.value());
            }
        } catch (NoSuchMethodException e) {
            System.err.println("Method not found: " + e.getMessage());
        }
    }
}
/*

To convert the provided Java 8 code to Java 20 while adhering to best practices, we will make use of modern Java features and ensure the code is clean, efficient, and secure. However, it's important to note that the provided code already uses annotation processing which is supported in Java 20 as well. Therefore, the conversion will mainly focus on incorporating best practices.

Here's the updated code:



### Changes and Best Practices Applied:
1. **Javadoc Comments**: Added Javadoc comments to describe the purpose of the annotation and the methods, enhancing code readability and maintainability.
2. **Annotation Target**: Specified the target of the annotation using `@Target(ElementType.METHOD)` to restrict its usage only to methods, which makes the code more robust.
3. **Annotation Documented**: Added `@Documented` to the annotation so that it appears in the generated documentation.
4. **Reflection for Annotation Access**: Added a reflective example to demonstrate how to access the annotation at runtime, which is a common use case for annotations.
5. **Exception Handling**: Included exception handling for `NoSuchMethodException` when accessing the method via reflection, making the code more robust and error-resistant.

This code remains compatible with Java 20 while adhering to modern Java practices.
*/