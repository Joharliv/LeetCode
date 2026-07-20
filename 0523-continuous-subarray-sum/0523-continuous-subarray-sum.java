class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

      HashMap <Integer , Integer> map = new HashMap<>();
      int ps = 0;
      map.put(0 , -1);
      boolean multiple = false;
      for(int i =0;i<nums.length;i++){
        ps += nums[i];
        int rem = ps % k;

        if(map.containsKey(rem)){
           if(i - map.get(rem) >= 2){
             return true;
           }
        }
        if(!map.containsKey(rem)){
            map.put(rem , i);
        }
      }
      return false;
    }
}