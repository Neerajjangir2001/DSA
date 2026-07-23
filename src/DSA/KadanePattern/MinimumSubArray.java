package DSA.KadanePattern;

public class MinimumSubArray {
    private int minimumSubArray(int[] nums){

        int i = 0;
        int bestEnding = nums[0];
        int ans = nums[0];

        for (i = 1; i< nums.length;i++){
            int v1 = bestEnding + nums[i];
            int v2 = nums[i];

            bestEnding = Math.min( v1 , v2);
            ans = Math.min(ans, bestEnding);
        }
        return ans;
    }

    public static void main(String[] args) {
        MinimumSubArray solution = new MinimumSubArray();

        int[] nums = {3, -1, 4, -2, 5};

        System.out.println(solution.minimumSubArray(nums));
    }
}
