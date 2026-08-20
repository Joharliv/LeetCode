class Solution {
    public int[] resultArray(int[] nums) {
        int[] a = new int[nums.length];
        int[] b = new int[nums.length];

        int i =0 , j = 0;
        a[0] = nums[0];
        b[0] = nums[1];

        i++;
        j++;

        for(int k = 2;k<nums.length;k++){
           if(a[i-1] > b[j-1]) {
              a[i] = nums[k];
              i++;
           }else{
              b[j] = nums[k];
              j++;
           }
        }
    
         for(int x = 0;x<j;x++){
            a[i++] = b[x];
         }
        
         return a;
    }
}