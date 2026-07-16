package DSA.Sliding_Windo;

import java.util.HashMap;

public class LongestKSubstr {


    public int longestKSubstr(String s, int k) {

        int low = 0;
        int res = -1;
        int high = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for ( high = 0; high<s.length(); high++){
            char chat = s.charAt(high);

            map.put(chat, map.getOrDefault(s.charAt(high), 0) + 1);



            while (map.size() > k){


                char ch = s.charAt(low);
                    map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0){
                    map.remove(ch);
                }
                low++;

            }
            if(map.size() == k){
                int len = high - low + 1;
                res = Math.max(res, len);
            }
        }

        return  res;

    }

    public static void main(String[] args) {

        LongestKSubstr solution = new LongestKSubstr();

        String s = "aabacbebebe";
        int k = 3;


        System.out.println(solution.longestKSubstr(s, k));


    }
}
