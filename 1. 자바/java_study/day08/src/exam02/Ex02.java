package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Student.id = 1000;
        System.out.println(Student.id);

        Class cls = Student.class;

        Student.staticMethod();
    }
}
