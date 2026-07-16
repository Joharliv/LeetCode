class Solution {
    public int subarraySum(int[] nums) {
        int [] ps = new int[nums.length];
        int sum = 0;
        ps[0] = nums[0];
        for(int i =1;i<nums.length;i++){
            ps[i] = ps[i-1] + nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            int start = Math.max(0 , i-nums[i]);
            sum += ps[i] - (start == 0 ? 0 : ps[start-1]);
        }
       return sum;
    }
}