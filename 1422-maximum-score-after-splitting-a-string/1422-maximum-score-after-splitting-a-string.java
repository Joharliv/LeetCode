class Solution {
    public int maxScore(String s) {
        int arr[] = new int[s.length()];
        int ps =0;
        int ss = 0;
        int score = 0;
        int max = 0;
        for(int i =0;i<s.length();i++){
            arr[i] = (s.charAt(i) - '0');
            if(arr[i] == 1){
                ss += 1;
            }
        }

        for(int i =0;i<arr.length-1;i++){
            if(arr[i] == 0){
                ps+=1;
            }
            else{
                ss -= 1;
            }
            score = ps+ss;
            max = Math.max(max , score);
        }

        return max;
    }
}