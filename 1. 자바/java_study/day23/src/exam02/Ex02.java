package exam02;

public class Ex02 {
    public static void main(String[] args) {
       //Calculator cal = (a,b) -> a + b;
        //int result = calc(cal, 10, 20);
        //int result = calc((a, b) -> a + b, 10, 20);
        int num3 = 10;
        int result = calc(new Calculator() {
            @Override
            public int add(int num1, int num2) {
                //num3 = 20; -> num 상수화 -> final
                return num1 + num2 + num3;
            }
        }, 10, 20);

        System.out.println(result);
    }

    public static int calc(Calculator cal, int num1, int num2) {
        return cal.add(num1, num2);
    }
}
