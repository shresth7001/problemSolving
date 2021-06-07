/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]*/
/* Two Pointer approach*/
import java.util.*;
class TestClass {
    public int[] twoSum(int[] nums, int target) {
     int temp[] = Arrays.copyOf(nums,nums.length);
        int ans[] = new int[2];
        Arrays.sort(temp);
        int i=0,j=nums.length-1;
        while(i<=j){
            if(temp[i]+temp[j]>target){
                j--;
            }
            else if(temp[i]+temp[j]<target){
                i++;
            }
            else break;
        }
        int first_no=temp[i];
        int second_no = temp[j];
        int ctr =0;
        for (int k=0;k<nums.length;k++){
            if(nums[k]== first_no && ctr==0){
                ans[0] =k;
                ctr++;
            }
            else if(nums[k]== second_no){
                ans[1] = k;
            }
        }
        
        return ans;
        
    }
}
