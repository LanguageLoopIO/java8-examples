// Java 8: Functional Interface
@FunctionalInterface
interface MyFunction {
    int apply(int x, int y);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunction sum = (a, b) -> a + b;
        System.out.println(sum.apply(5, 10));  // Outputs 15
    }
}
