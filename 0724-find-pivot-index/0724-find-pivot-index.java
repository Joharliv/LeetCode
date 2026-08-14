class Solution {
    public int pivotIndex(int[] nums) {
       int ss = 0;
       int ps = 0;
       for(int i : nums){
          ss += i;
       }

       for(int i = 0;i<nums.length;i++){
        if(i == 0) ps = 0;
        else{ps+= nums[i-1];}
            
        ss -= nums[i];

        if(ps == ss) return i;
       }
       return -1;

    }
}