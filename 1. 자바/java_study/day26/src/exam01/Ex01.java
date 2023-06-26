package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("1반", "이이름"));
        students.add(new Student("2반", "김이름"));
        students.add(new Student("3반", "박이름"));
        students.add(new Student("1반", "최이름"));
        students.add(new Student("2반", "김이름"));
        students.add(new Student("3반", "정이름"));
        students.add(new Student("1반", "김이름"));
        students.add(new Student("2반", "박이름"));
        students.add(new Student("3반", "최이름"));


        Map<String, List<Student>> students2 = students
                .stream().collect(Collectors.groupingBy(Student::getBan));

        List<Student> ban1 = students2.get("1반");
        List<Student> ban2 = students2.get("2반");
        List<Student> ban3 = students2.get("3반");

        System.out.println("---- 1반 ----");
        ban1.stream().forEach(System.out::println);

        System.out.println("---- 2반 ----");
        ban2.stream().forEach(System.out::println);

        System.out.println("---- 3반 ----");
        ban3.stream().forEach(System.out::println);
    }
}
