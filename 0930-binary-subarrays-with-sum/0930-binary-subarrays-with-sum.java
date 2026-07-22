class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ps = 0;
        int count = 0;
        map.put(0 , 1);
        for(int i =0;i<nums.length;i++){
            ps+= nums[i];

            if(map.containsKey(ps-goal)){
                count+= map.get(ps-goal);
            }

            map.put(ps , map.getOrDefault(ps,0)+1);
        }

        return count;
    }
}