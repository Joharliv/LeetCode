class Solution {
        public int smallestNumber(int n, int t) {
        int val = n;
        while(true){
            n = val;
            int res = 1;
            while(n > 0){
              int digit = n%10;
              res *= digit;
              n /= 10;
            }
            if(res%t == 0) break;
            else val++;
        }
        return val;
    }
}