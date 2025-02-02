// Java 8: CompletableFuture
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> System.out.println("Task executed"));
        future.get(); // Block until completion
    }
}
