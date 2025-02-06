// Java 20: Sealed classes with pattern matching in switch
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

        // Pattern matching in switch (Java 17+)
        switch (vehicle) {
            case Car car -> car.drive();
            case Truck truck -> truck.drive();
            default -> throw new IllegalStateException("Unexpected value: " + vehicle);
        }
    }
}


/*

The code you provided is already utilizing a feature introduced in Java 15: sealed classes. Since the task is to upgrade the code to Java 20, we can take advantage of any additional modern features introduced after Java 15. In this case, Java 20 introduces enhancements in pattern matching, record patterns, and virtual threads, among other features. However, these features are not directly applicable to your example since it doesn't involve pattern matching or threading.

To make the code more modern and aligned with Java 20 best practices, we can improve it as follows:

1. **Enhanced `switch` with pattern matching (introduced in Java 17)**: We'll use pattern matching for type checks in a switch statement.
2. **Records (introduced in Java 16)**: If applicable, we could refactor some of the classes into records, but this example doesn't seem to suit records because `Car` and `Truck` have behavior (methods) and are not just data carriers.
3. **Text Blocks (introduced in Java 15)**: We could use text blocks for multi-line strings, but there are no multi-line strings in this code.
4. **Virtual Threads (Project Loom, introduced in Java 19)**: If the application were multi-threaded, we could leverage virtual threads for better performance. However, this example does not involve threads.

Thus, the main improvement here would involve using pattern matching for type checks in the `main` method. Below is the upgraded code:

### Upgraded Code for Java 20



### Explanation of Changes:
1. **Switch with Pattern Matching**:
   - In the `main` method, we replaced the direct `vehicle.drive()` call with a `switch` statement that uses pattern matching. This makes it easier to handle different types of `Vehicle` in the future and is a modern approach introduced in Java 17.

2. **`@Override` Annotation**:
   - Added the `@Override` annotation to the `drive` methods in `Car` and `Truck` to ensure they correctly override the `drive` method from `Vehicle`. This improves readability and prevents accidental method signature mismatches.

3. **Default Case in Switch**:
   - Added a `default` case to handle unforeseen scenarios where `vehicle` is of an unexpected type. While this shouldn't occur due to the sealed class hierarchy, it's a good defensive programming practice.

### Potential Enhancements with Virtual Threads:
If the example were extended to include multi-threaded execution, we could use the `java.util.concurrent.Executors` API with virtual threads. Let me know if you'd like to see an example of how to incorporate virtual threads in the context of this code!
*/