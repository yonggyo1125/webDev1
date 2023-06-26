package exam03;

public class Student {
    int id; // 학번
    String name; // 이름
    String subject; // 과목

    public Student() {
        // 생성자가 객체를 생성한 이후 작업
        // 정의된 변수가 공간을 할당 받은 시점 이후
        id = 1000;
        name = "이름1";
        subject = "과목1";
    }

    public Student(int id2, String name2, String subject2) {
        id = id2;
        name = name2;
        subject = subject2;
    }
    void showInfo() {
        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);
    }
}
