package exam01;

public class Ex08 {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ABC";
        String str3 = new String("ABC");

        System.out.println("str1 : " + str1.hashCode());
        System.out.println("str2 : " + str2.hashCode());
        System.out.println("str3 : " + str3.hashCode());

        boolean result = isSame(str1, str2);
        System.out.println(result);

        boolean result2 = isSame(str1, str3);
        System.out.println(result2);
    }

    public static boolean isSame(String str1, String str2) {
        return str1.equals(str2); // 동등성 비교
    }
}
