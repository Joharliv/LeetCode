class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i:nums){
            if(!set.contains(i)){
                set.add(i);
                if(i != 0) count++;
            };
        }
      return count;
    }
}