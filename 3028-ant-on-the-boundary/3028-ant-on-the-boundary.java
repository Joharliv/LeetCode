class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int ps = 0;
        int count = 0;
        for(int i =0;i<nums.length;i++){
            ps+= nums[i];
             
            if (ps == 0){
                count++;
            }
        }

        return count;
    }
}