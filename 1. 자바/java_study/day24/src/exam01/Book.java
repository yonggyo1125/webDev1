package exam01;

import java.util.function.Supplier;

public class Book {
    private String title;
    private String author;

    public Book() {}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void printInfo() {
        //Supplier<String> supplier = () -> showInfo();
        Supplier<String> supplier = this::showInfo;
        System.out.println(supplier.get());
    }

    public String showInfo() {
        return String.format("title=%s, author=%s", title, author);
    }
}
