/*
There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.

For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.

 

Example 1:


Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
*/
class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int p=0,count=0;
        int x=0,y=0;
        int[][] array=new int[n][m];
        for(int i=0;i<indices.length;i++)
        {
            x=indices[p][0];//row
            y=indices[p][1];//col
            for(int j=0;j<m;j++)
            {
                array[x][j]++;
            }
            for(int j=0;j<n;j++)
            {
                array[j][y]++;
            }
            p++;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(array[i][j]%2!=0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}