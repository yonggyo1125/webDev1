package exam01;

//import java.lang.*;  - 컴파일러가 자동 추가해 주는 소스

public class Ex01 {
    public static void main(String[] args) {
        //java.lang.String str = "ABC";
       // String str = "ABC";
        //Object s1 = new Student();
        Student s1 = new Student();
        System.out.println(s1.toString()); // Object::toString()
        System.out.println(s1); // s1.toString()

    }
}
