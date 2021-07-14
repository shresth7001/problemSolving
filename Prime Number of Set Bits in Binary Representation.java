/*
Given two integers left and right, return the count of numbers in the inclusive range [left, right] having a prime number of set bits in their binary representation.

Recall that the number of set bits an integer has is the number of 1's present when written in binary.

For example, 21 written in binary is 10101 which has 3 set bits.
 

Example 1:

Input: left = 6, right = 10
Output: 4
Explanation:
6 -> 110 (2 set bits, 2 is prime)
7 -> 111 (3 set bits, 3 is prime)
9 -> 1001 (2 set bits , 2 is prime)
10->1010 (2 set bits , 2 is prime)
*/
class Solution {
public int countPrimeSetBits(int left, int right) {
int[] prime_sequence = {0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1};
int ans=0;
for(int i=left;i<=right;i++){
int num = Integer.bitCount(i);
if(prime_sequence[num]==1)
ans++;
}
return ans;
}
}