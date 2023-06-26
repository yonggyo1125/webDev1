package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "학생1", "과목1");
        //s1.showInfo();
        System.out.println("s1 = " + System.identityHashCode(s1));
        s1.showInfo();

        Student s2 = new Student(1001, "학생2", "과목2");
        System.out.println("s2 = " + System.identityHashCode(s2));
        s2.showInfo();

        s2 = null;
    }


}
