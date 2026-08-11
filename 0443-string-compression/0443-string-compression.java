class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }

        int i = 0,
            j = 0;

        String s = "";

        while (j <= chars.length) {
            int count =0;
            if (j == chars.length || chars[i] != chars[j]) {
                s += chars[i];
                count = j-i;
                
                if(count > 1) s+= count;
                
                i = j;
            }
            j++;
        }

        for(int k = 0;k<s.length();k++){
            chars[k] = s.charAt(k);
        }
        
        return s.length();
    }
}