package DSA.KadanePattern;

public class MaxSubArray {

    private  int maxSubArray(int[] nums){

        int i = 0;
        int bestEnding = nums[0];
        int ans = nums[0];

        for ( i = 1; i< nums.length; i++){
            int v1 = bestEnding + nums[i];
            int v2 = nums[i];

            bestEnding = Math.max(v1, v2);
            ans = Math.max(ans, bestEnding);

        }

        return ans;
    }

    public static void main(String[] args) {
        MaxSubArray solution = new MaxSubArray();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(solution.maxSubArray(nums));
    }
}
