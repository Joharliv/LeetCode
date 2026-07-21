class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length == 1){
            return (double)nums[0];
        }
        double sum = 0;
        double avg = 0;
        double max = Integer.MIN_VALUE;

        for(int i =0;i<k;i++){
            sum+= nums[i];
        }
        avg = sum/k;
        max = Math.max(max, avg);
        for(int i = k;i<nums.length;i++){
            sum-= nums[i-k];
            sum+= nums[i];

            avg = sum/k;
            max = Math.max(max, avg);
        }
        return (double)max;
    }
}