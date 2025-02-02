// Java 9: @SafeVarargs
public class SafeVarargsExample {
    @SafeVarargs
    public static <T> void printArray(T... values) {
        for (T value : values) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        printArray(1, 2, 3, 4);
    }
}
