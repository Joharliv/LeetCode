class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int len = 1;
        
        int count = 0;
        while(len <= s.length()){
            int count_zero = 0;
            int count_one = 0;
            for(int i =0;i<len;i++){
                int a = s.charAt(i) == '0' ? count_zero++ : count_one++;
            }
            if(count_zero <=k || count_one<= k){
                    count++;
                }
            for(int i = len;i<s.length();i++){
                if(s.charAt(i-len) == '0'){
                    count_zero--;
                }
                else{
                    count_one--;
                }
                int a = s.charAt(i) == '0' ? count_zero++ : count_one++;

                if(count_zero <=k || count_one<= k){
                    count++;
                }
           
            }
            len += 1;
        }
        return count;
    }
}