package exam01;

public class Ex11 {
    public static void main(String[] args) {
        int age = 12;
        if (age < 8) {
            System.out.println("유치원생!");
        } else if (age < 14) { // age >= 8 && age < 14
            System.out.println("초등학생!");
        } else if (age < 17) { // age >= 14 && age < 17
            System.out.println("중학생!");
        } else if (age < 20) { // age >= 17 && age < 20
            System.out.println("고등학생!");
        } else {
            System.out.println("성인!");
        }
    }
}
