class Solution {
    public int largestAltitude(int[] gain) {
        int ps = 0;
        int max = 0;
        for(int i : gain){
            ps+=i;
            max = Math.max(max, ps);
        }
        return max;
    }
}