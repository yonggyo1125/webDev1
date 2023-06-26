package exam01;

public class Ex03 {
    public static void main(String[] args) {
        try {
            int num1 = 100;
            int num2 = 0;

            int result = num1 / num2; // throw new ArithmeticException(...)
            System.out.println(result);

            String str = null;
            str.toUpperCase(); // throw new NullPointerException(...)

        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
