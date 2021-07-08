/*Add to Array-Form of Integer
Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

*/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int counter = 0;
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for (int value : nums) {
            if (myMap.containsKey(value)) {
                counter += myMap.get(value);
                myMap.put(value, myMap.get(value) + 1);
            } else {
                myMap.put(value, 1);
            }
        }
        
        return counter;
    }
}