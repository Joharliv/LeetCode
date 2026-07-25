class Solution {
    public int maxProduct(int n) {
        int i = 0;
        int len = String.valueOf(n).length();
        int arr[] = new int[len];
        while(n>0){
            int digit = n%10;
            arr[i] = digit;
            i++;
            n = n/10;
        }
        
        Arrays.sort(arr);
        return arr[len-1]*arr[len-2];
    }
}