package exam03;

public class Ex02 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int num = (int)(Math.random() * 45 + 1); /// 1~45
            System.out.println(num);
        }
    }
}
