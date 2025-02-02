// Java 8: Lambda with multiple statements
public class LambdaMultipleStatements {
    public static void main(String[] args) {
        Runnable run = () -> {
            System.out.println("First statement");
            System.out.println("Second statement");
        };
        run.run();
    }
}
