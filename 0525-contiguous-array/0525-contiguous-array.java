class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int ps = 0;
        int ans = 0;
        map.put(0 , -1);
        for(int i =0;i<nums.length;i++){
           if(nums[i] == 0){
            ps-= 1;
           }
           else{
            ps += 1;

           }

           if(map.containsKey(ps)){
            ans = Math.max(ans , i- map.get(ps));
           }
           else{
            map.put(ps , i);
           }
           
        }
        return ans;
    }
}