class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] freq = new int[51];

        if (k == nums.length) {
            int max = -1;
            for (int i : nums) {
                max = Math.max(max, i);
            }
            return max;
        }

        else {
            for (int i = 0; i <= nums.length - k; i++) {
                for (int j = i; j <= k + i - 1; j++) {
                    freq[nums[j] - 0]++;
                }
            }

            for (int i = freq.length - 1; i >= 0; i--) {
                if (freq[i] == 1)
                    return i;
            }
        }
        return -1;
    }
}