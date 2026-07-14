class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ps[] = new int[nums.length];
        int ss[] = new int[nums.length];
        int res[] = new int[nums.length];

        ps[0] = 0;
        ss[nums.length -1] = 0;
        for(int i =1;i<nums.length;i++){
            ps[i] = ps[i-1] + nums[i-1];
        }
        for(int i =nums.length-2;i>=0;i--){
           ss[i] = ss[i+1] +nums[i+1];
        }
        for(int i =0;i<nums.length;i++){
            res[i] = Math.abs(ps[i]-ss[i]);
        }
        return res;
    }
}