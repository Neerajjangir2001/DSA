package DSA.Sliding_Windo;

public class MaximumSumSubarray {

    public int maxSubarraySum(int[] arr, int k) {
        // Code here
     int low = 0;
     int high = k - 1;
     int sum = 0;

     int res = 0;
     for (int i = low; i <= high; i++) {
          sum = sum + arr[i];
     }
     while (high < arr.length){
         res = Math.max(res, sum);
         low++;
         high++;

         if (high == arr.length)     break;

         sum = sum - arr[low - 1] + arr[high];

     }


        return res;
    }

    public static void main(String[] args) {
        MaximumSumSubarray ms = new MaximumSumSubarray();

        int[] arr = {100,200,300,400};
        int K = 2;

        System.out.println(ms.maxSubarraySum(arr, K));
    }
}
