class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = -1;
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }

        max = Math.max(max, count);

        for (int i = k; i < s.length(); i++) {
            char pos = s.charAt(i - k);
            char ch = s.charAt(i);

            if ("aeiou".indexOf(pos) != -1)
                count--;

            if ("aeiou".indexOf(ch) != -1) {
                count++;
                max = Math.max(max, count);

            }
        }
        return max;
    }
}