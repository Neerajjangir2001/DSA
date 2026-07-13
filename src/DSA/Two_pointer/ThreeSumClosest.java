package DSA.Two_pointer;


//Problem Statement
//
//Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
//
//Return the sum of the three integers.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
     int closest = nums[0] + nums[1] + nums[2] ;

      for (int i= 0; i < nums.length - 2; i++) {
          int left = i + 1;
          int right = nums.length - 1;

          while ( left < right){

              int sum = nums[i] + nums[left] + nums[right];

              if (sum == target) {
                  return sum;
              }
              if  (Math.abs(sum - target) < Math.abs(closest - target)){
                  closest = sum;
              }

              if (sum < target){
                  left++;
              } else {
                  right--;
              }
          }

      }

        return closest;
    }

    public static void main(String[] args) {

        ThreeSumClosest solution = new ThreeSumClosest();

        int[] nums = {-1,2,1,-4};
        int target = 1;

        int result = solution.threeSumClosest(nums, target);

        System.out.println(result);
    }
}