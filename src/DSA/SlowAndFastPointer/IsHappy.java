package DSA.SlowAndFastPointer;

public class IsHappy {

    public boolean isHappy(int n) {

       int slow = n;
       int fast = n;

       while (fast != 1){
           slow = findSquareSum(slow);

           fast = findSquareSum(findSquareSum(fast));

           if (slow == fast && slow != 1) {
               return false;
           }
       }

        fast = 1;
        return true;
    }

    public int findSquareSum(int n) {

      int sum = 0;
      while (n > 0){
          int d = n % 10;
          n = n / 10;
            sum = sum + d * d;
      }

        return sum  ;
    }

    public static void main(String[] args) {
        IsHappy solution = new IsHappy();

        int n = 19;

        System.out.println(solution.isHappy(n));
    }
}
