package exam01;

public class Ex05 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(1000);
        System.out.println("sb = " + System.identityHashCode(sb));

        sb.append("ABC");
        System.out.println("sb = " + System.identityHashCode(sb));

        sb.append("DEF");
        System.out.println("sb = " + System.identityHashCode(sb));

        sb.append("GHI");
        System.out.println("sb = " + System.identityHashCode(sb));

        String str = sb.toString();
        System.out.println(str);
        System.out.println("str = " + System.identityHashCode(str));
    }
}
