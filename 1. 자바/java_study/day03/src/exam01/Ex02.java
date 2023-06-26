package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int num = 10;

        boolean result = ++num > 12 || (num = num + 10) > 10;
        System.out.printf("num=%d%n", num);



        int num2 = 10;

        boolean result2 = ++num2 > 20 && (num2 = num2 + 10) < 30;
        System.out.printf("num2=%d%n", num2);

    }
}
