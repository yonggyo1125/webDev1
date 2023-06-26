package exam02;

public class Ex04 {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(100);
        Integer num2 = 200;
        Integer num3 =Integer.valueOf(num1.intValue() + num2.intValue());
        System.out.println(num3);
    }
}
