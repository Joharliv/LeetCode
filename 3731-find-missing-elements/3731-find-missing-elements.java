class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length -1];

        int[] available = new int[max-min+1];

        for(int i = 0;i<nums.length;i++){
           int idx = nums[i] - min;
           available[idx] = 1;
        }

        for(int i =0;i<available.length;i++){
            if(available[i] != 1){
                list.add(i+min);
            }
        }
       return list;
    }
}