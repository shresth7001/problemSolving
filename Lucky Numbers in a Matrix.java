/* 
Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

 

Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column
Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
*/
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int min,minIndex;
        List<Integer> list = new ArrayList();
        for(int i=0;i<matrix.length;i++){
            min = 100000;
            minIndex = -1;
            for(int j=0;j<matrix[i].length;j++){
                if(min>matrix[i][j]){
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            int maxi = -1;
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][minIndex]>maxi)
                    maxi = matrix[j][minIndex];
        }
            if(maxi == min)
                list.add(maxi);
    }
return list;
    }
}