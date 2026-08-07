class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] res = new int[nums.length];
       int[] ps = new int[nums.length];
       int[] ss = new int[nums.length];

       ps[0] = 1;

       for(int i =1;i<nums.length;i++){
          ps[i] = ps[i-1]*nums[i-1];
       }

       ss[nums.length -1] = 1;
       for(int i =nums.length-2;i>=0;i--){
          ss[i] = ss[i+1]*nums[i+1];
       }

       for(int i = 0;i<nums.length;i++){
        res[i] = ps[i]*ss[i];
       }

       return res;
       
    }
}