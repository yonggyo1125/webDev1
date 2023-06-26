package exam02;

public class Ex08 {
    public static void main(String[] args) {
        int num = 100;

        //Integer num2 = Integer.valueOf(num);
        //num2.byteValue();
        Integer num2 = num; // Integer.valueOf(num); // 오토박싱

        Integer num3 = 200; // Integer.valueOf(200)


        int num4 = num2 + num3; // 언박싱 -> 성능저하
    }
}
