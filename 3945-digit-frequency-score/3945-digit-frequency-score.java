class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int[] arr = new int[10];
        int res = 0;
        int i =0;
        while(n>0){
            int digit = n%10;
            arr[i] = digit;
            n /= 10;
            i++;
        }

        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0)+1);
        }

       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        int val = entry.getKey();
        int freq = entry.getValue();

        res += val*freq;
       }

        return res;

    }
}