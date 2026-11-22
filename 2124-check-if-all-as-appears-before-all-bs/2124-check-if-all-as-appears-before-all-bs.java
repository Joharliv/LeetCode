class Solution {
    public boolean checkString(String s) {

        int a_idx = -1;
        int b_idx = -1;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == 'a') a_idx = i;
        }

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'b'){
            b_idx = i;
            break;
            }
        }
        
        return (b_idx > a_idx || b_idx == -1) ? true : false;
    }
}