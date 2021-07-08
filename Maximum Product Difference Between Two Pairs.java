/*You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

    ruleKey == "type" and ruleValue == typei.
    ruleKey == "color" and ruleValue == colori.
    ruleKey == "name" and ruleValue == namei.

Return the number of items that match the given rule.

 

Example 1:

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].



*/

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ct = 0;
        for(int i=0;i<items.size();i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)){
                ct++;
            }
        if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)){
            ct++;
        }
        if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)){
            ct++;
        }
        }
    return ct;
    }
}