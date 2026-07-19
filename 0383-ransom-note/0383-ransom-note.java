class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int i  =0;
        int j =0;
        
        char arr[] = magazine.toCharArray();
        Arrays.sort(arr);
        char arr2[] = ransomNote.toCharArray();
        Arrays.sort(arr2);
       
        while(i < arr2.length && j<arr.length){
            if(arr2[i] == arr[j]){
                i++;
            }
            j++;
        }

        return i == ransomNote.length();
    }
}