package exam03;

public interface Calculator {
    int NUM = 10; // public static final num = 10 -> 정적 상수

    int add(int num1, int num2); // public abstract

    default int minus(int num1, int num2) {
        privateMethod();
       // num = 20;
        int result = num1 - num2;
        return result;
    }

    public static void staticMethod() {
        System.out.println("정적 메서드 호출!");
    }

    private void privateMethod() {
        System.out.println("Private Method!");
    }

}
