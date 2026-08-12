class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int small = -1;
        int max = -1;
        while(left < right){
           small = Math.min(height[left] , height[right]);
           int area = (right - left)*small;
           max = Math.max(max, area);
           
           if(height[right] < height[left]) right--;
           else left++;
        }
        return max;
    }
}