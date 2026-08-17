class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        int total = n*(n+1)/2;
        int dup = -1;
        int miss = -1;
        int sum =0;

        for(int i : nums){
            if(set.contains(i)){
                dup = i;
            }else{
            set.add(i);
            sum+= i;
            }
        }
        miss = total - sum;

        return new int[]{dup, miss};
    }
}