package exam01;

public class PerformaceCalculator implements Calculator {

    private Calculator calculator;

    public PerformaceCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public long factorial(long num) {

        long stime = System.nanoTime(); // 추가 기능
        try {
            long result = calculator.factorial(num); // 핵심 기능
            return result;
        } finally {
            long etime = System.nanoTime(); // 추가 기능
            System.out.printf("걸린 시간 : %d%n", etime - stime);
        }
    }
}
