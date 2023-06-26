package exam02;

import java.io.IOException;
import java.io.PrintStream;

public class Ex12 {
    public static void main(String[] args) throws IOException {
        System.setErr(new PrintStream("err.log"));

        //throw new RuntimeException("에러 발생!!!");

        int result = 10 / 0;
    }
}
