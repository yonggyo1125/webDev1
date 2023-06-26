package exam01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        Collections.shuffle(nums);
        System.out.println(nums);
        // Collections.rotate(nums, 2);
        //System.out.println(nums);
        //Collections.rotate(nums, 2);
        //System.out.println(nums);
    }
}
