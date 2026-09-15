class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i :nums){
            if(i%2==0){
                map.put(i , map.getOrDefault(i , 0)+1);
            }
        }

        int ans = -1;
        int max = -1;
        for(int i:nums){
            if(map.containsKey(i)){
               if(map.get(i) > max){
                  max = map.get(i);
                  ans = i;
               }
               if(map.get(i) == max){
                   if(i<ans) ans = i;
               }
            }
        }
        return ans;
    }
}