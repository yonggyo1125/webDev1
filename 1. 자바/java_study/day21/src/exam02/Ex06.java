package exam02;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        int[] nums = new int[10];

        Arrays.fill(nums, 1);

        System.out.println(Arrays.toString(nums));


        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,2,4,5,6};
        int index = Arrays.mismatch(nums1, nums2);
        System.out.println(index);
    }
}
