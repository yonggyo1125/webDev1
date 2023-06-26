package exam03;

import java.util.stream.Stream;

public class Ex03 {
    public static void main(String[] args) {
        Stream.iterate(2, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        Stream.generate(() -> 1)
                .limit(10)
                .forEach(System.out::println);
    }
}
