import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        // Using var for local variable type inference
        var future = CompletableFuture.runAsync(() -> System.out.println("Task executed"))
                                    .exceptionally(ex -> {
                                        System.err.println("An error occurred: " + ex.getMessage());
                                        return null;
                                    });

        // Instead of blocking with future.get(), use future.join()
        future.join();
    }
}
/*

Sure, let's convert the given Java 8 code to Java 20 while adhering to best practices for performance, security, compliance, and modern Java features.

In Java 20, there are several new features and improvements, but the core `CompletableFuture` API remains largely the same. However, we can take advantage of the following best practices:

1. **Avoid Blocking Calls**: Avoid using `future.get()` which blocks the thread. Instead, use `future.join()` which is more idiomatic for `CompletableFuture`.
2. **Exception Handling**: Handle exceptions gracefully using `exceptionally()` or `handle()`.
3. **Resource Management**: Ensure that any resources used in asynchronous tasks are properly managed.
4. **Use of `var` for Local Variables**: Java 10 introduced `var` for local variable type inference, which can improve code readability.

Here is the updated code:



### Explanation:

1. **`var` for Local Variable Type Inference**: Using `var` for the `future` variable makes the code cleaner and more readable.
2. **Exception Handling**: Added an `exceptionally()` block to handle any exceptions that might occur during the execution of the asynchronous task. This prevents unhandled exceptions from terminating the program abruptly.
3. **Non-blocking Alternative**: Replaced `future.get()` with `future.join()`, which is non-blocking and more idiomatic when working with `CompletableFuture`.

This code is now more robust, readable, and aligns with best practices in Java 20.
*/