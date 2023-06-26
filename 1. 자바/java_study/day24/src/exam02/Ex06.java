package exam02;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        String[] chars = { "AA", "AA", "AAA", "BB", "BBB", "BBBB", "CC", "CCC", "CCCC"};
        Arrays.stream(chars)
                .filter(s -> s.length() >= 3)
                .limit(3)
                .forEach(System.out::println);
    }
}
