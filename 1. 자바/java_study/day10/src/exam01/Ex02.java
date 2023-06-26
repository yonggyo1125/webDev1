package exam01;

public class Ex02 {
    public static void main(String[] args) {
        //C c = new C();
        A a = new C();

        A ad = new D();

        if (ad instanceof C) {
            C c = (C) ad;
        }

        if (a instanceof C) {
            C c2 = (C) a;
        }

    }
}
