public class Solution {
    public int beautySum(String s) {
        int totalBeauty = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];  

            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                freq[c - 'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;

                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }

                totalBeauty += (max - min);
            }
        }

        return totalBeauty;
    }
}
