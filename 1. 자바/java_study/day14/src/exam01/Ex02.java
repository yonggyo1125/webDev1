package exam01;

public class Ex02 {
    public static void main(String[] args) {
        try {
            int num1 = 100;
            int num2 = 2;

            int result = num1 / num2; // throw new ArithmeticException(...)
            System.out.println(result);

            String str = null;
            str.toUpperCase(); // throw new NullPointerException(...)

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("유입1");

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("유입2");
        }
    }
}
