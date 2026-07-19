class Solution {
    public int fib(int n) {
        int f_zero = 0;
        int f_one = 1;
        int f_two = 0;
        if(n == 0 || n == 1){
            return n==0 ? f_zero : f_one;
        }
        for(int i = 2;i<=n;i++){
            f_two = f_one + f_zero;
            f_zero = f_one;
            f_one = f_two;
        }
        return f_two;
    }
}