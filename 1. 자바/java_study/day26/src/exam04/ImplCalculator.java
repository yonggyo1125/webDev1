package exam04;

public class ImplCalculator implements Calculator {
    @Override
    public long factorial(long num) {

        long total = 1L;
        for (int i = 1; i <= num; i++) {
            total *= i;
        }

        return total;
    }
}
