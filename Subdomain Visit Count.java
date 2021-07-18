/*
A website domain like "discuss.leetcode.com" consists of various subdomains. At the top level, we have "com", at the next level, we have "leetcode.com", and at the lowest level, "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.

Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space, followed by the address. An example of a count-paired domain might be "9001 discuss.leetcode.com".

We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains, (in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.

Example 1:
Input: 
["9001 discuss.leetcode.com"]
Output: 
["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]
Explanation: 
We only have one website domain: "discuss.leetcode.com". As discussed above, the subdomain "leetcode.com" and "com" will also be visited. So they will all be visited 9001 times.

*/
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> result = new ArrayList();
        Map<String,Integer> mp = new HashMap();
        String[] splitStr;
        Integer c;
        for(int i=0; i< cpdomains.length ;i++){
         splitStr = cpdomains[i].split(" ");
         c= Integer.parseInt(splitStr[0]);
            mp.put(splitStr[1],mp.getOrDefault(splitStr[1],0)+c);
            String[] b = splitStr[1].split("\\.");
            for(int j=1;j<b.length;j++){
            if( j== b.length-1){
                mp.put(b[j],mp.getOrDefault(b[j],0)+c);
            } else{
                mp.put(b[j]+"."+b[j+1],mp.getOrDefault(b[j]+"."+b[j+1],0)+c);
            }
                
            }
        }
        for(Map.Entry<String,Integer> entry : mp.entrySet()){
            result.add(entry.getValue()+" "+entry.getKey());
        }
        
        return result;
    }
}