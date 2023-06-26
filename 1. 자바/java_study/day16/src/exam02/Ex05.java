package exam02;

public class Ex05 {
    public static void main(String[] args) {
        Integer num1 = new Integer(100); // JDK9
        Integer num2 = new Integer(100);
        System.out.println("num1 : " + System.identityHashCode(num1));
        System.out.println("num2 : " + System.identityHashCode(num2));

        Integer num3 = Integer.valueOf(100);
        Integer num4 = Integer.valueOf(100);
        System.out.println("num3 : " + System.identityHashCode(num3));
        System.out.println("num4 : " + System.identityHashCode(num4));
    }
 }
