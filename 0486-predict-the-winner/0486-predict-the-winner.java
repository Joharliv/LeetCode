class Solution {
    public boolean predictTheWinner(int[] nums) {
        int p1 = maxScore(nums, 0 , nums.length -1);
        if(p1 >= 0){
            return true;
        }else{
            return false;
        }
    }

    private int maxScore(int nums[] , int left , int right){
        if(left == right){
            return nums[left];
        }
        int cl = nums[left] - maxScore(nums , left + 1 , right);
        int cr = nums[right] - maxScore(nums , left , right - 1);

        return Math.max(cl , cr);
    }
}