package exam03;

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Random rand = new Random();
        rand.ints().limit(10).forEach(System.out::println);

        rand.doubles().limit(10).forEach(System.out::println);
    }
}
