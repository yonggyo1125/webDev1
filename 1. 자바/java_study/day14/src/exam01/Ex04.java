package exam01;

import java.io.FileNotFoundException;

public class Ex04 {
    public static void main(String[] args) {
        try {
            int num1 = 100;
            int num2 = 2;

            int result = num1 / num2; // throw new ArithmeticException(...)
            System.out.println(result);
            String str = null;
            str.toUpperCase(); // 어떤 예외가 발생할지 잘 모를때..... 다형성
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("유입1");

        } catch (Exception e) { // ArithmeticException를 제외한 모든 발생 예외가 유입
            System.out.println(e.getMessage());
            System.out.println("유입2");
        }
    }
}
