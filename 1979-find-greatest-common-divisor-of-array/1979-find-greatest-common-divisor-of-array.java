class Solution {
    public int gcd(int a , int b){
            if(b == 0){
                return a;
            }
            else{
                return gcd(b , a%b);
            }
        }


    public int findGCD(int[] nums) {
        int max  = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        
        int res = gcd(min , max);
        return res;

    }
}