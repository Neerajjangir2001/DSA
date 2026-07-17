package DSA.Sliding_Windo;

import java.util.HashMap;



public class CharacterReplacement {

    public int characterReplacement(String s, int k) {

    int low = 0, high = 0;
    int ans = 0;
    int[] arr =  new int[26];
        int  maxFreq = 0;

    for (high = 0; high < s.length(); high++) {

        char ch = s.charAt(high);
        arr[ch - 'A']++;

        maxFreq = Math.max(maxFreq,arr[ch -'A']);


        while ((high - low + 1) - maxFreq > k) {
            arr[s.charAt(low) - 'A']--;
            low++;
        }
        ans = Math.max(ans, high - low + 1);
    }

        return ans;
    }

    public static void main(String[] args) {

        CharacterReplacement solution = new CharacterReplacement();

        String s = "AABBBC";
        int k = 1;

        System.out.println(solution.characterReplacement(s, k));
    }
}
