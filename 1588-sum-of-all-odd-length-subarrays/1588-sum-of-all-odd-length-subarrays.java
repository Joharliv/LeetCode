class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int res = 0;
        for(int len = 1;len <= n;len+=2){
        int sum = 0;
        for(int i =0;i< len;i++){
           sum += arr[i];
        }
        res+= sum;
        
        for(int i = len ;i<n;i++){
            sum -= arr[i-len];
            sum += arr[i];

            res += sum;
           
        }
        }
        return res;
    }
}