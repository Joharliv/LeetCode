class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int freq[] = new int[26];
        char[] arr = s.toCharArray();

        for(int i =0;i<n/2;i++){
            freq[arr[i] - 'a']++;
        }

        int idx = 0;
        for(int i =0;i<26;i++){
            while(freq[i] -- >0){
                arr[idx++] = (char)(i + 'a');
            }
        }

        for(int i =0;i<n/2;i++){
           arr[n-i-1] = arr[i];
        }

        return new String(arr);

    }
}