class Solution {
    public boolean scoreBalance(String s) {
        int arr[] = new int[s.length()];
        int ps = 0;
        int ss = 0;
        for(int i =0;i<s.length();i++){
            arr[i] = (s.charAt(i) - 'a')+1;
            ss += arr[i];
        }
        
        for(int i =0;i<arr.length;i++){
            ps += arr[i];
            ss -= arr[i];

            if(ps == ss){
                return true;
            }
        }
     return false;   
    }
}