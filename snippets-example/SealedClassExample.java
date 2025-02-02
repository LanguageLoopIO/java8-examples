// Java 15: Sealed classes
public sealed class Vehicle permits Car, Truck {
    public void drive() {
        System.out.println("Vehicle is driving");
    }
}

public final class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving");
    }
}

public final class Truck extends Vehicle {
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
