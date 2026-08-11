class Solution {
    public int missingInteger(int[] nums) {
        int ps = nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i] == nums[i-1] + 1 ){
                ps+= nums[i];
            }else{
                break;
            }
        }

        System.out.println(ps);
        Arrays.sort(nums);
        int val = ps;
        for(int i : nums){
            if(i == val){
                val++;
            }
        }
        return val;
    }
}