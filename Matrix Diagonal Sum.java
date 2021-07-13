/*
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

 

Example 1:


Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

*/
class Solution {
    public int diagonalSum(int[][] mat) {
       int PD=0,SD =0,n=mat.length;
        for(int i=0;i<n;i++){
           PD += mat[i][i]; 
           SD += mat[i][n-1-i];
        }
    PD += SD;
          if(n%2==1)
            return PD-mat[n/2][n/2];
    return PD;
        }

}