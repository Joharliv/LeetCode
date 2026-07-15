class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        int ps = 0;
        int ss = 0;
        for(int i =0;i<nums.length;i++){
            ss+= nums[i];
        }

        for(int i =0;i<nums.length-1;i++){
            ps += nums[i];
            ss -= nums[i];
 
            if((ps - ss)%2== 0){
                count++;
            }
        }
        return count;
    }
}