class Solution {
    public int minimumPushes(String word) {
        Integer[] freq = new Integer[26];
        Arrays.fill(freq, 0);
        int count = 0;
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            freq[ch - 'a']++;
        }

        Arrays.sort(freq , Collections.reverseOrder());
        for(int i =0;i<26;i++){
            count += (i/8 + 1)*freq[i];
        }
        return count;
    }
}