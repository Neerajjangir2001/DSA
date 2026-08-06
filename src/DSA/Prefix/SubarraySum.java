package DSA.Prefix;

import java.util.HashMap;

public class SubarraySum {

    private  int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, 1);
        int res = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            int query = sum - k;
            int freq = map.getOrDefault(query, 0);
            res += freq;
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        SubarraySum solution = new SubarraySum();

        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println(solution.subarraySum(nums, k));
    }
}
