package DSA.Two_pointer;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        int left = 0;

        for (int right = 1; right < nums.length ; right++) {

            if (nums[left]!= nums[right]){
                left++;
                nums[left] = nums[right];

            }
        }
        return left + 1;
    }

    public static void main(String[] args) {

        RemoveDuplicates solution = new RemoveDuplicates();

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = solution.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.println(Arrays.toString(nums));


    }
}
