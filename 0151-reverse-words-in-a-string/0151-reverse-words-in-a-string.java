class Solution {
    public String reverseWords(String s) {
        s = s.replaceAll("\\s+" , " ");
        String[] word = s.split(" ");
        String res = "";
        boolean first = true;
        for(int i  = word.length - 1;i>=0;i--){
            if(first){
                res += word[i];
                first = false;
            }else{
                 res += " ";
                 res += word[i];
            }
        }
        return res.trim();
    }
}