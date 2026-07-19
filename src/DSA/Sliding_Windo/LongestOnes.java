package DSA.Sliding_Windo;

public class LongestOnes {

    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int low = 0;
        int zero = 0;

        for ( int high = 0; high < nums.length; high++) {
          if (nums[high] == 0) {
              zero++;
          }
          while (zero > k){
              if (nums[low] ==0){
                  zero--;
              }
              low++;
          }
            ans = Math.max(ans, high - low + 1);

        }

        return ans;

    }

    public static void main(String[] args) {

        LongestOnes solution = new LongestOnes();

        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        System.out.println(solution.longestOnes(nums, k));
    }
}
