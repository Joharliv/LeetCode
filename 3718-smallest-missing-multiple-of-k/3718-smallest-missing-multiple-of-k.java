class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int multiple = k;

        for(int i:set){
            if(set.contains(multiple)){
                multiple +=k;
            }
        }
        return multiple;
    }
}