class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer , Integer> map = new HashMap<>();

        while(n>0){
            int digit = n%10;
            map.put(digit , map.getOrDefault(digit , 0)+1);
            n/= 10;
        }

        int ans  = Integer.MAX_VALUE;
        int val = Integer.MAX_VALUE;
        for(int i : map.keySet()){
           if(map.get(i) < val) {
               val = map.get(i);
               ans = i;
           }
           else if(map.get(i) == val) {
            if(i < ans) ans = i;
           }
        }
        return ans;
    }
}