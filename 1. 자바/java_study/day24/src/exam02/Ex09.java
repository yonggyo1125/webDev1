package exam02;

import java.util.stream.IntStream;

public class Ex09 {
    public static void main(String[] args) {
        //IntStream.rangeClosed(0, 10).forEach(x -> System.out.println(x + "번 반복"));

        int total = IntStream.rangeClosed(1, 100).sum();
        System.out.println(total);
    }
}
