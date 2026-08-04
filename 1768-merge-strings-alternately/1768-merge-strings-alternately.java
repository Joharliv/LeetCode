class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0;
        int j =0;
        while(i < len1 && j<len2){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(j);
            res += ch1;
            res += ch2;
            
            i++;
            j++;
        }
        

        if(i == len1){
            while(j<len2){
            res+= word2.charAt(j++);
            }
        }else{
            while(i<len1){
            res+= word1.charAt(i++);
            }
        }
       return res;
        
    }
}