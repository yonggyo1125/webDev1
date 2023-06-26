package exam01;

public class Ex03 {
    public static void main(String[] args) {
        add(10, 20);
        add(10, 20, 30);
    }

    static int add(int num1, int num2) {
        int num3 = num1 + num2;

        return num3;
    }

    static int add(int num1, int num2, int num3) {
        int num4 = num1 + num2 + num3;

        return num4;
    }
}
