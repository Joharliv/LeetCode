class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer , String> map = new TreeMap<>(Collections.reverseOrder());
        String[] ans = new String[names.length];
        for(int i =0;i<names.length;i++){
            map.put(heights[i] , names[i]);
        }
        int j =0;
        for(String i : map.values()){
            ans[j] = i;
            j++;
        }
        return ans;

    }
}