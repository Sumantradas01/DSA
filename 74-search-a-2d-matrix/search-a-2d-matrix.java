class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int StartRow = 0 , EndRow = m-1;
        while(StartRow <= EndRow){
            int midRow = StartRow + (EndRow - StartRow)/2;
            if(target >= matrix[midRow][0] && target <= matrix[midRow][n-1]){
                return SearchInRow(matrix, target, midRow);
            }else if(target >= matrix[midRow][n-1]){
                StartRow = midRow + 1;
            }else{
                EndRow = midRow-1;
            }
        }
        return false;
    }

    public boolean SearchInRow(int[][] mat, int target, int row){
        int n=mat[0].length;
        int st =0; 
        int end = n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(target == mat[row][mid]){
                return true;
            }else if(target > mat[row][mid]){
                st = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }

}