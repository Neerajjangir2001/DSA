package DSA.Two_pointer;

import java.util.Arrays;

public class Two_Sum {


    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Return 1-based indices
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Two_Sum solution = new Two_Sum();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;


        int[] result = solution.twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }
}
