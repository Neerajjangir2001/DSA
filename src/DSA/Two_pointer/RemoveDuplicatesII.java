package DSA.Two_pointer;


//Problem Statement
//
//Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice.
//
//The relative order of the elements should remain the same.
//
//Return the number of elements after removing the extra duplicates.
//
//Do not allocate another array. Modify the input array in-place with O(1) extra space.



public class RemoveDuplicatesII {

    public int removeDuplicates(int[] nums) {

        int left = 2;

        for (int right = 2; right < nums.length ; right++) {

            if (nums[left-2] != nums[right]  ){
                nums[left] = nums[right];
                left++;

            }
        }
        return left ;
    }

    public static void main(String[] args) {

        RemoveDuplicatesII solution = new RemoveDuplicatesII();

        int[] nums = {1, 1, 1, 2, 2, 3};

        int k = solution.removeDuplicates(nums);

        System.out.println("k = " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

