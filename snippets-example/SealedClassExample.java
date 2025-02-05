// Java 20: Using sealed classes with best practices
public sealed class Vehicle permits Car, Truck {
    public void drive() {
        System.out.println("Vehicle is driving");
    }
}

public final class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}

public final class Truck extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Truck is driving");
    }
}

public class SealedClassExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.drive();
    }
}
/*

The provided code is already using a feature from Java 15, sealed classes, which are not available in Java 8. However, since you're asking to convert this code to Java 20, I'll ensure that the code leverages any new or improved features from Java 20, while maintaining best practices in performance, security, compliance, and modern Java features.

Java 20 introduced a few new features, but none of them directly impact the structure of the given code. The main focus will be on ensuring the code is clean, efficient, and adheres to modern Java best practices. Here is the refined version of the code:



### Key Changes and Best Practices Applied:
1. **Use of `@Override` Annotation**: This is a best practice to indicate that a method is intended to override a method in a superclass. It helps in maintaining the code and prevents potential errors if the method signature in the superclass changes.
2. **Comments**: Updated comments to reflect the use of sealed classes, which were introduced in Java 15, and the target Java 20 version.
3. **Code Structure**: The code structure remains clean and adheres to the principles of inheritance and polymorphism, which are core OOP concepts.

### Additional Considerations:
- **Java 20 Features**: As of Java 20, there are no new features that would directly change the structure or behavior of this code. However, future versions might introduce new features that could be applicable.
- **Security and Compliance**: Ensure that your build environment is set up to use Java 20, and that you are following any security guidelines or compliance requirements specific to your organization or project.
- **Performance**: The code is already optimized for the task it performs. No performance improvements are needed for this specific example.

This code should run correctly in a Java 20 environment and adheres to modern Java best practices.
*/