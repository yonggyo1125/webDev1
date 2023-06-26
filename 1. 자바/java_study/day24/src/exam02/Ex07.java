package exam02;

import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Orange", "Mango", "Melon", "Banana"};

        //Arrays.stream(fruits).map(s -> s.length()).forEach(System.out::println);
        // String -> Integer
        Arrays.stream(fruits).mapToInt(s -> s.length()).forEach(System.out::println);
                                // String -> int
    }
}
