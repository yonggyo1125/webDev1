package exam01;

public class Ex07 {
    public static void main(String[] args) {
        String fruits = "Apple,Orange,Mango,Melon,Apple";
        int index = fruits.indexOf("Apple");
        System.out.println("indexOf : " + index);

        int index2 = fruits.lastIndexOf("Apple");
        System.out.println("lastIndexOf : " + index2);

        /*
        int index = fruits.indexOf("Mango");
        System.out.println(index);

        int index2 = fruits.indexOf("Mango2"); // 없는 단어 -1
        System.out.println(index2); // -1

         */
    }
}
