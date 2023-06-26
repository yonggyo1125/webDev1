package exam01;

import java.util.Arrays;
import java.util.Random;

public class Ex10 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 7, 9, 11 };
        boolean matched1 = Arrays.stream(nums).allMatch(n -> n % 2 == 1);
        System.out.println(matched1);

        int[] nums2 = { 1, 2, 4, 6, 8, 10};
        boolean matched2 = Arrays.stream(nums2).anyMatch(n -> n % 2 == 1);
        System.out.println(matched2);

        boolean _matched2 = false;
        for (int num : nums2) {
            if (num % 2 == 1) {
                matched2 = true;
                break;
            }
        }


        int[] nums3 = { 2, 4, 6, 8, 10};
        boolean matched3 = Arrays.stream(nums3).noneMatch(n -> n % 2 == 1);
        System.out.println(matched3);

        Random rand = new Random();
        int r = rand.ints().filter(n->n%2 == 1).findFirst().getAsInt();
        System.out.println(r);

    }
}
