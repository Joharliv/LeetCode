class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int res[][] = new int[n][n];

        for(int i =0;i<n;i++){
                int left = 0;
                int right = n - 1;
            for(int j = 0;j<n;j++){
                while(left < right){
                    int temp = image[i][left];
                    image[i][left] = image[i][right];
                    image[i][right] = temp;

                    left++;
                    right--;
                }
            }
        }

       

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(image[i][j] == 0){
                    res[i][j] = 1;
                }else{
                    res[i][j] = 0;
                }
            }
        }

       return res;
    }
}