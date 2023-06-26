package exam01;

public class Ex08 {
    public static void main(String[] args) {
        String str = "";
        System.out.println("isEmpty : " + str.isEmpty()); // true

        String str2 = "     ";
        System.out.println("isBlank : " + str.isBlank()); // true
        System.out.println("trim().isEmpty() : " + str.trim().isEmpty());

        String str3 = "         ABC        ";
        System.out.println("trim() : " + str3.trim());
    }
}
