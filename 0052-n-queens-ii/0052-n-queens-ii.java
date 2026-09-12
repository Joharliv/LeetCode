class Solution {
    public boolean isSafe(int[][] board , int row, int col, int n){
        
        for(int i=0;i<row;i++){
            if(board[i][col] == 1) return false;
        }

        for(int i = row -1 , j = col -1;i>=0 && j >=0 ;i-- , j--){
            if(board[i][j] == 1) return false;
        }

        for(int i = row-1 , j = col+1;i>=0 && j <n ;i-- , j++){
            if(board[i][j] == 1) return false;
        }
         
         return true;
    }
    public int nQueens(int[][] board , int row , int n , int ans){
        if(row == n){
            return ans + 1;
        }

        for(int j =0;j<n;j++){
            if(isSafe(board , row , j, n)){
                board[row][j] = 1;
                ans = nQueens(board , row+1 , n, ans);
                board[row][j] = 0;
            }
        }
        return ans;
    }

    public int totalNQueens(int n) {
        int[][] board = new int[n][n];

        for(int i =0;i<n;i++){
            Arrays.fill(board[i] , 0);
        }

        return nQueens(board , 0, n , 0);
        

    }
}