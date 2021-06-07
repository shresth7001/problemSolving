/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true

Example 2:

Input: nums = [1,2,3,4]
Output: false
*/
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                return true;
            }
        mp.put(nums[i],1);
        }
    return false;
    }
}