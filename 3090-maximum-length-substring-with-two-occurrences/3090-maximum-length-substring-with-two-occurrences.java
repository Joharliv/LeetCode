class Solution {
    public int maximumLengthSubstring(String s) {
        int ans = 0;
        int start = -1;
        int k =2;
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch , 0)+1);
            while(map.get(ch) > k){
                start++;
                map.put(s.charAt(start) , map.get(s.charAt(start)) -1);
            }
            ans = Math.max(ans , i-start);
        }
        return ans;
    }
}