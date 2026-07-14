class Solution {
    public int pivotInteger(int n) {
        

        int prev = 0;
        int ps = 0;
        int ss = (n*(n+1))/2;
        for(int i =1;i<=n;i++){
            prev = ps;
            ps += i;
            ss -= i-1;

            if(ps == ss){
                return i;
            }
        }
        return -1;
    }
}