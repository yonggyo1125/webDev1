package org.koreait;


public class Ex03 {
    public static void main(String[] args) {
        Book3 book = Book3.builder()
                .title("책1")
                .author("저자1")
                .publisher("출판사1")
                .build();
        System.out.println(book);
    }
}
