package exam02;

import static exam02.Transportation.*;

public class Ex04 {
    public static void main(String[] args) {
        int busFare = BUS.getTotal(10);
        System.out.printf("busFare=%d%n", busFare);

        int taxiFare = TAXI.getTotal(2);
        System.out.printf("taxiFare=%d%n", taxiFare);

        System.out.println(BUS.getName());
        System.out.println(TAXI.getName());
        System.out.println(SUBWAY.getName());
    }
}
