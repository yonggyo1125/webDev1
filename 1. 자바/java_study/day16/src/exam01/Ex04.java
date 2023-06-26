package exam01;

public class Ex04 {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("str = " + System.identityHashCode(str));

        str += "DEF";
        System.out.println("str = " + System.identityHashCode(str));

        str += "GHI";
        System.out.println("str = " + System.identityHashCode(str));

    }
}
