package exam02;

public class Ex03 {
    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println(result);

        int result2 = add(20, 30);
        System.out.println(result2);
    }

    static int add(int num1, int num2) {
        int num3 = num1 + num2;

        return num3;
    }
}
