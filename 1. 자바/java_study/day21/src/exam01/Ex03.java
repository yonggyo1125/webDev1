package exam01;

import java.util.TreeSet;

public class Ex03 {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("이름2");
        names.add("이름4");
        names.add("이름3");
        names.add("이름1");
        names.add("이름5");

        System.out.println(names);

        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(33);
        nums.add(22);
        nums.add(41);
        nums.add(5);
        nums.add(99);
        System.out.println(nums);

    }
}
