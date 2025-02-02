// Java 8: Lambda expressions
public class LambdaExample {
    public static void main(String[] args) {
        // Using lambda expression to implement functional interface
        Runnable run = () -> System.out.println("Hello from Lambda!");
        run.run();
    }
}
