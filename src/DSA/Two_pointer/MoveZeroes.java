package DSA.Two_pointer;




//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.
//
//
//
//Example 1:
//
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]


import java.util.Arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums){

        int left = 0;
        int right = 0;

        while ( right < nums.length ){

            if (nums[left] ==0  && nums[right] ==0 ){

                right++;
            } else if (  nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right++;
            }
        }



    }

    public static void main(String[] args) {
        MoveZeroes arr = new MoveZeroes();
        int[] nums = {0,0,1};
        arr.moveZeroes(nums);
        System.out.println(Arrays.toString(nums) );
    }



}
