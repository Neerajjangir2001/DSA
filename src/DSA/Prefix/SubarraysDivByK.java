package DSA.Prefix;

import java.util.HashMap;

public class SubarraysDivByK {

    private  int subarraysDivByK(int[] nums, int k){

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, 1);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
                sum += nums[i];

                int remainder = sum % k;
                if (remainder < 0)
                    remainder = remainder + k;
                count += map.getOrDefault(remainder, 0);
                map.put(remainder, map.getOrDefault(remainder, 0) + 1);


        }
        return count;

    }

    public static void main(String[] args) {
        SubarraysDivByK solution = new SubarraysDivByK();

        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;

        System.out.println(solution.subarraysDivByK(nums, k));
    }
}
