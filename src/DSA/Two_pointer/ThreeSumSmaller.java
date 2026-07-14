package DSA.Two_pointer;

import java.util.Arrays;

public class ThreeSumSmaller {


    public int Solution(int[] nums, int target) {

        Arrays.sort(nums);
        int ans  = 0 ;

        for (int i= 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < target) {

                  ans +=  (right-left);
                left++;
                }else {
                   right--;
                }
            }
        }



        return ans;
    }

    public static void main(String[] args) {

        ThreeSumSmaller solution = new ThreeSumSmaller();

        int[] nums = {5, 1, 3, 4, 7};
        int target = 12;



        System.out.println(solution.Solution(nums, target));
    }
}
