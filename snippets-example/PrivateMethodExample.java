// Java 9: Private methods in interfaces
interface MyInterface {
    private void privateMethod() {
        System.out.println("Private method in interface");
    }

    default void defaultMethod() {
        privateMethod();
    }
}

public class PrivateMethodExample implements MyInterface {
    public static void main(String[] args) {
        new PrivateMethodExample().defaultMethod();
    }
}
