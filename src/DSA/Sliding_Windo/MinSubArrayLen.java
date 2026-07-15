package DSA.Sliding_Windo;

public class MinSubArrayLen
{

    public int minSubArrayLen(int target, int[] nums) {

        int low = 0, high = 0, sum = 0;
        int ans = Integer.MAX_VALUE;

        while (high < nums.length){
            sum += nums[high];

            while (sum >= target){
                ans = Math.min(ans, high - low + 1);
                sum -= nums[low];
                low++;
            }
            high++;
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {

        MinSubArrayLen solution = new MinSubArrayLen();

        int target = 7;
        int[] nums = {2,3,1,2,4,3};

        System.out.println(solution.minSubArrayLen(target, nums));
    }
}
