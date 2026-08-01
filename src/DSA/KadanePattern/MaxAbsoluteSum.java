package DSA.KadanePattern;

public class MaxAbsoluteSum {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnding  = nums[0];
        int minEnding  = nums[0];
        int ans = Math.abs(nums[0]);


        for (int i = 1; i< nums.length; i++){
            maxEnding = Math.max(nums[i], nums[i] + maxEnding);
            minEnding = Math.min(nums[i], nums[i] + minEnding);
            ans = Math.max(ans, Math.max(maxEnding, Math.abs(minEnding)));

        }
        return ans;

    }

    public static void main(String[] args) {
        MaxAbsoluteSum solution = new MaxAbsoluteSum();

        int[] nums = {2,-5,1,-4,3,-2};

        System.out.println(solution.maxAbsoluteSum(nums));
    }
}
