// Java 8: Default method in interface
interface MyInterface {
    default void greet() {
        System.out.println("Hello from the interface!");
    }
}

public class DefaultMethodExample implements MyInterface {
    public static void main(String[] args) {
        new DefaultMethodExample().greet();
    }
}
