class Solution {
    public int gcd(int a , int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b , a%b);
        }
    }


    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        int len1 = str1.length();
        int len2 = str2.length();

        int res = gcd(len1 , len2);

        return str1.substring(0 , res);
    }
}