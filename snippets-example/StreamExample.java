// Java 8: Stream API to process collections
public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .map(n -> n * n)
               .forEach(System.out::println);
    }
}
