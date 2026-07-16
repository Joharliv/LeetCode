class Solution {
    public boolean isPalindrome(String s) {
      s = s.toLowerCase();
      
      s = s.replaceAll("[^a-z0-9]+" , "");
      StringBuilder str = new StringBuilder(s).reverse();
     
      for(int i =0;i<str.length();i++){
        if(str.charAt(i) != s.charAt(i)){
             return false;
        }
      }
      return true;
    }
}