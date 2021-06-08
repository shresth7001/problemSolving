/*Maximum Subarray
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:

Input: nums = [1]
Output: 1
*/

class Solution {
    public int maxSubArray(int[] nums) {
int cursum = 0;
int bestSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cursum=Math.max(nums[i],nums[i]+cursum);
            bestSum = Math.max(cursum,bestSum);
        }
        return bestSum;
    }
}