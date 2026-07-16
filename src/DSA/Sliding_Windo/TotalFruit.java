package DSA.Sliding_Windo;

import java.util.HashMap;

public class TotalFruit {

    public int totalFruit(int[] fruits) {

        int low = 0, high = 0;
        int ans = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (high = 0; high < fruits.length; high++){
            map.put(fruits[high], map.getOrDefault(fruits[high], 0) + 1);

            while (map.size()>2){
                int num = fruits[low];
                map.put(num, map.get(num) - 1);
                if (map.get(num) == 0){
                    map.remove(num);
                }
                low++;
            }
            if ( map.size() == 2 ||map.size() < 2 ){
                int len = high - low + 1;
                ans = Math.max(ans, len);
            }

        }

        return ans;
    }

    public static void main(String[] args) {

        TotalFruit solution = new TotalFruit();

        int[] fruits = {1,2,3,2,2};

        System.out.println(solution.totalFruit(fruits));
    }
}
