package exam01;

import java.util.Optional;

public class Ex08 {
    public static void main(String[] args) {
        Book book = null;
        Optional<Book> opt = Optional.ofNullable(book);
        //Book book2 = opt.orElseThrow(); // get()
        //Book book2 = opt.orElseThrow(() -> new BookNotFoundException());
        Book book2 = opt.orElseThrow(BookNotFoundException::new);
    }
}
