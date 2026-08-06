class Solution {
    public String reverseVowels(String s) {
       char[] str = s.toCharArray();
       int left = 0;
       int right = str.length -1;

       while(left<right){
        if("aeiouAEIOU".indexOf(str[left]) != -1 && 
           "aeiouAEIOU".indexOf(str[right])!= -1){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
 
            left++;
            right--;
        }
        else if("aeiouAEIOU".indexOf(str[left]) == -1){
            left++;
        }else{
            right--;
        }
       }
       return new String(str);
    }
}