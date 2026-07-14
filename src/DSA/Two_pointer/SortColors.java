package DSA.Two_pointer;

import java.util.Arrays;
import java.util.Collections;


import static java.util.Collections.swap;

public class SortColors {
    public void sortColors(int[] nums) {

       int low = 0;
       int high = nums.length-1;
       int mid = 0;

       while (mid <= high){
          if (nums[mid] == 0){
              int temp = nums[low];
              nums[low] = nums[mid];
              nums[mid] = temp;
         low++;
         mid++;
          }else if (nums[mid] == 1){
              mid++;

          }else if (nums[mid] == 2){

              int temp = nums[mid];
              nums[mid] = nums[high];
              nums[high] = temp;
              high--;

          }


       }

    }

    public static void main(String[] args) {

        SortColors solution = new SortColors();

        int[] nums = {2, 0, 2, 1, 1, 0};

        solution.sortColors(nums);

        System.out.println(Arrays.toString(nums));
    }
}
