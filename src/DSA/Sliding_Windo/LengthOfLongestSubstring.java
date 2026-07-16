package DSA.Sliding_Windo;

import java.util.HashMap;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        int low = 0, high = 0;
        int ans = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for ( high = 0; high < s.length(); high++) {

            char ch= s.charAt(high);
          map.put(ch, map.getOrDefault(s.charAt(high), 0) + 1);

          while (map.get(ch) > 1) {
              char c = s.charAt(low);
              map.put(c, map.get(c) - 1);
              low++;
          }
          ans = Math.max(ans, high - low + 1);

        }


        return ans;
    }

    public static void main(String[] args) {

        LengthOfLongestSubstring solution = new LengthOfLongestSubstring();

        String s = "abcabcbb";

        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}
