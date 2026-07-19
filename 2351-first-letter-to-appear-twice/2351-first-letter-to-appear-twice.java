class Solution {
    public char repeatedCharacter(String s) {
        int freq[] = new int[26];
        char res = 'a';
        for(int i =0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;

            if(freq[s.charAt(i) - 'a'] == 2){
               res = s.charAt(i) ;
               break;
            }
        }
        return res;
    }
}