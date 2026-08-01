package DSA.KadanePattern;

public class MaximumSum {

    private  int maximumSum (int[] arr) {

        int noDelete = arr[0];
        int oneDelete = arr[0];
        int ans = arr[0];

        for (int i = 1 ; i< arr.length; i++) {
            int prevNoDelete = noDelete;
            int prevOneDelete = oneDelete;

            noDelete = Math.max(noDelete + arr[i],arr[i]);
            oneDelete = Math.max(oneDelete + arr[i],prevNoDelete);

            ans = Math.max(ans, Math.max(noDelete, oneDelete));
        }
        return ans;

    }

    public static void main(String[] args) {
        MaximumSum solution = new MaximumSum();

        int[] nums = {1, -2, 0, 3};

        System.out.println(solution.maximumSum(nums));
    }
}
