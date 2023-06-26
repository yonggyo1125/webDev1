package exam01;

import java.util.function.Supplier;

public class Ex02 {
    public static void main(String[] args) {
        Book book = new Book("책1", "저자1");

        //Supplier<String> func1 = () -> book.showInfo();
        Supplier<String> func1 = book::showInfo;
        System.out.println(func1.get());

        book.printInfo();
    }
}
