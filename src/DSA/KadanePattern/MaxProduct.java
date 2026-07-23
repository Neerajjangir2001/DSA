package DSA.KadanePattern;

public class MaxProduct {
    private int maxProduct(int[] nums){
        int i = 0;
        int minEnding = nums[0];
        int maxEnding = nums[0];
        int ans = nums[0];

        for (i =1; i< nums.length;i++){
            int v1 = nums[i];
            int v2 = minEnding * nums[i];
            int v3 = maxEnding * nums[i];

            maxEnding = Math.max(v1, Math.max(v2, v3));
            minEnding = Math.min(v1, Math.min(v2, v3));

            ans = Math.max(ans, Math.max(maxEnding,minEnding));
        }
        return ans;
    }

    public static void main(String[] args) {
        MaxProduct solution = new MaxProduct();

        int[] nums = {2,3,-2,4};

        System.out.println(solution.maxProduct(nums));
    }
}
