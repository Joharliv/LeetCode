class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        String res = "";
        Boolean first = true;
        for(String word : words){
           if(!first){
            res += " ";
           }
           for(int i = word.length() -1 ;i>=0;i--){
             res += word.charAt(i);
           }
           first = false;
           
        }

        return res;
    }
}