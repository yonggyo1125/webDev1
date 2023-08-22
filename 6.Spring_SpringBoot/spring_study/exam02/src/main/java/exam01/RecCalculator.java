package exam01;

public class RecCalculator implements Calculator {
    @Override
    public long factorial(long num) {
        long stime = System.nanoTime();
        try {
            if (num < 1L) {
                return 1L;
            }

            return num * factorial(num - 1L);
        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린 시간 : %d%n", etime - stime);
        }
    }
}
