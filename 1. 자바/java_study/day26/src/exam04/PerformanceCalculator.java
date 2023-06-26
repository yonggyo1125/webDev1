package exam04;

public class PerformanceCalculator implements Calculator {

    private Calculator calculator;

    public PerformanceCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public long factorial(long num) {
        long stime = System.nanoTime(); // 추가 기능
        try {
            return calculator.factorial(num); // 핵심기능

        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린시간 : %d%n", etime - stime); // 추가 기능
        }
    }
}
