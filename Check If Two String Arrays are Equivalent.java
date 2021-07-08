/*
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

 

Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
*/

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1="",w2="";
        for(int i=0;i<word1.length;i++){
            w1 += word1[i];
        }
        for(int i=0;i<word2.length;i++){
            w2 += word2[i];
        }
    if(w1.equals(w2)){
        return true;
    }
    return false;
    }
}