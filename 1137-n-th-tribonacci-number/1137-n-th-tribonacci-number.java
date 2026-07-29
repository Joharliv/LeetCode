class Solution {
    public int tribonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        int d =0;
        
        if(n == 0 || n == 1 || n==2){
           return n == 0 ? 0 :1;
            
        }
        for(int i = 3;i<=n;i++){
            d = a+b+c;
            a = b;
            b = c;
            c = d;
        }

        return d;
    }
}