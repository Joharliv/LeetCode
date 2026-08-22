class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int val = n;

        while(val >0){
            int digit = val%10;
            sum += digit;
            prod *= digit;
            val /= 10;
        }

        return n %(sum + prod) == 0;
    }
}