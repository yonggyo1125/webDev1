package exam01;

public class RecCalcualtor implements Calculator {
    @Override
    public long factorial(long num) {
        long total = 1L;
        if (num < 1) {
            return 1;
        }

        total *= num;

        return num * factorial(num - 1);
    }
}
