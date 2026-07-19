class Solution {
    public int lengthOfLastWord(String s) {
        String word[] = s.split(" ");
        String val = word[word.length -1];
        return val.length();
    }
}