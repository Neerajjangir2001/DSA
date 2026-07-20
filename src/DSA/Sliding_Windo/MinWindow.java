package DSA.Sliding_Windo;

import java.util.HashMap;



public class MinWindow {

    public String minWindow(String s, String t) {


        int[] need = new int[128];
        int[] window = new int[128];

        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int required = 0;

        for (int i = 0; i < 128; i++) {
            if (need[i] > 0) {
                required++;
            }
        }

        int formed = 0;

        int low = 0;

        int minLen = Integer.MAX_VALUE;

        int start = 0;

        for (int high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);

            window[ch]++;

            if (need[ch] > 0 && window[ch] == need[ch]) {
                formed++;
            }

            while (formed == required) {

                if (high - low + 1 < minLen) {
                    minLen = high - low + 1;
                    start = low;
                }

                char left = s.charAt(low);

                window[left]--;

                if (need[left] > 0 && window[left] < need[left]) {
                    formed--;
                }

                low++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }





    public static void main(String[] args) {

        MinWindow solution = new MinWindow();

        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(solution.minWindow(s, t));
    }
}
