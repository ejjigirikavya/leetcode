class Solution {
    public int[][] transpose(int[][] matrix) {
        int mat[][]=new int[matrix[0].length][matrix.length];
     for(int r=0;r<matrix.length;r++){
        for(int c=0;c<matrix[0].length;c++){
            mat[c][r]=matrix[r][c];
        }
     }
     return mat;   
    }
}