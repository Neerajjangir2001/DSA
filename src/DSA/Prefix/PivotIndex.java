package DSA.Prefix;

public class PivotIndex {


    public int pivotIndex(int[] nums) {


        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            int right = sum - left - nums[i];

            if (left == right) {
                return i;
            }

            left += nums[i];
        }
        return -1;

    }

    public static void main(String[] args) {
        PivotIndex solution = new PivotIndex();

        int[] nums = {1, 7, 3, 6, 5, 6};

        System.out.println(solution.pivotIndex(nums));
    }
}
