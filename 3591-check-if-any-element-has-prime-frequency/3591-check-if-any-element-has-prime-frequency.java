class Solution {
    public boolean isPrime(int n){
        if(n == 1) return false;
        if(n == 2) return true;

        for(int i = 2;i<n;i++){
            if(n%i == 0) return false;
        }
        return true;
        
    }
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i:nums){
            map.put(i , map.getOrDefault(i, 0)+1);
        }

        for(int i:nums){
            int val = map.get(i);
            if(isPrime(val)) return true;
        }
        return false;
    }
}