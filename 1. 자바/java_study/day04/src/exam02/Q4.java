package exam02;

public class Q4 {
    //구구단을 홀수 단만 출력하도록 프로그램을 만드시오.
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {

            if (i % 2 == 0) { // 짝수단일때 건너뛰기 -> 홀수만 출력
                continue;
            }

            System.out.printf("====== %d단 ========%n", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
        }
    }
}
