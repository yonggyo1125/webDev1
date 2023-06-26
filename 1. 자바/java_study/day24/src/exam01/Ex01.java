package exam01;

import java.util.function.*;

public class Ex01 {
    public static void main(String[] args) {
       // Consumer<String> c1 = s -> System.out.println(s);
        Consumer<String> c1 = System.out::println;

        c1.accept("ABC");

       // BiPredicate<String, String> func1 = (s1, s2)-> s2.equals(s1);
        BiPredicate<String, String> func1 = String::equals;
        System.out.println(func1.test("ABC", "ABC"));
    }
}
