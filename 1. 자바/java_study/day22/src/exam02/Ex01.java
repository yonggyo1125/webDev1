package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Transportation trans = Transportation.TAXI;
        String name = trans.name();
        int ordinal = trans.ordinal();
        System.out.printf("name=%s, ordinal=%d%n", name, ordinal);

        //Transportation trans2 = Enum.valueOf(Transportation.class, "BUS");
        Transportation trans2 = Transportation.valueOf("BUS");

    }
}
