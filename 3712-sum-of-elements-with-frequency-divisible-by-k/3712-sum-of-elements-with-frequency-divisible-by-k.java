class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int sum = 0;
        for(int i : nums){
            map.put(i , map.getOrDefault(i , 0)+1);
        }

        
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
           int key = entry.getKey();
           int val = entry.getValue();

          if(val%k == 0) sum+= key*val;
        }

        return sum;
    }
}