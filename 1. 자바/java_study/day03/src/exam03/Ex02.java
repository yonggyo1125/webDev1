package exam03;

public class Ex02 {
    public static void main(String[] args) {
       //int num = 0;
        //int total = 0;
        int num = 1, total = 0;

        while(num <= 100) {

            //total = total + num;
            total += num;

            //num = num + 1;
            num++;

        }

        System.out.printf("총합=%d%n", total);

        // int num - 초기값,  num <= 100 - 조건식, num++ - 증가식
    }
}
