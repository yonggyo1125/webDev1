package exam02;

public interface Sell {
    void sell();

    default void order() {


        System.out.println("Sell - 주문!");
    }
}
