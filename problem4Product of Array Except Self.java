/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int Tprod = nums[0],zeros=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] !=0){
            Tprod=Tprod*nums[i];
        }
            else{
                zeros++;
                if(zeros>1)
                    break;
            }
    }
        for(int i=0;i<nums.length;i++){
            if(zeros>1){
                nums[i]=0;
            }else if(zeros == 1){
                nums[i]= nums[i]==0? Tprod: 0;
            }
            else{
                nums[i]=Tprod/nums[i];
            }
        }
    return nums;
    }
}