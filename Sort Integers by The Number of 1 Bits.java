/*
Given an integer array arr. You have to sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.

Return the sorted array.
Example 1:

Input: arr = [0,1,2,3,4,5,6,7,8]
Output: [0,1,2,4,8,3,5,6,7]
Explantion: [0] is the only integer with 0 bits.
[1,2,4,8] all have 1 bit.
[3,5,6] have 2 bits.
[7] has 3 bits.
The sorted array by bits is [0,1,2,4,8,3,5,6,7]
*/
class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int ct = 0,temp,index=0;
        Map<Integer,List<Integer>> mp = new HashMap();
        for(int i=0;i<arr.length;i++){
            ct = 0; temp = arr[i];
            while(temp>0){
                temp &= temp-1;
                ct++;
            }
        if(mp.containsKey(ct)){
            List<Integer> list = mp.get(ct);
            list.add(arr[i]);
            mp.put(ct,list);
        }
            else{
                List<Integer> list = new ArrayList();
                list.add(arr[i]);
                mp.put(ct,list);
            }
         }
    for(int key:mp.keySet()){
        for(int val:mp.get(key)){
            arr[index++]=val;
        }
    }
    return arr;
    }
}