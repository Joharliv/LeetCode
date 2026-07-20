class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int ps[] = new int[arr.length];
        int res[] = new int[queries.length];

        ps[0] = arr[0];
        for(int i =1;i<arr.length;i++){
            ps[i] = ps[i-1]^arr[i];
        } 

        for(int i = 0;i<queries.length;i++){
            int left = queries[i][0];
            int right = queries[i][1];
            
            res[i] = left == 0 ? ps[right] : ps[right]^ps[left -1];

        }

        return res;
    }
}