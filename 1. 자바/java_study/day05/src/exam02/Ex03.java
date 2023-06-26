package exam02;

public class Ex03 {
    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println(result);
    }

    static int add(int num1, int num2) { // 지역

        int num3 = num1 + num2;

        return num3;
    }
}
