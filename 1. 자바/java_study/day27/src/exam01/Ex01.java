package exam01;

public class Ex01 {
    public static void main(String[] args) {

        Calculator cal1 = new PerformaceCalculator(new ImplCalculator());
        long result1 = cal1.factorial(10L);  // 핵심 기능
        System.out.printf("result1=%d%n", result1);


        Calculator cal2 = new PerformaceCalculator(new RecCalcualtor());
        long result2 = cal2.factorial(10L);
        System.out.printf("result2=%d%n", result2);
    }
}
