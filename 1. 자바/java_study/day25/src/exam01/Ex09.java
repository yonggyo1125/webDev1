package exam01;

public class Ex09 {
    public static void main(String[] args) {
        Book book = null;
        if (book == null) {
            throw new BookNotFoundException();
        }
    }
}
