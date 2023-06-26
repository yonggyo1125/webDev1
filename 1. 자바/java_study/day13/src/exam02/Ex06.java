package exam02;

public class Ex06 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;
            int result = num1 / num2; // ArithmethicException

            String str = null;
            str.toUpperCase(); // NullPointerException
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());

        }
    }
}
