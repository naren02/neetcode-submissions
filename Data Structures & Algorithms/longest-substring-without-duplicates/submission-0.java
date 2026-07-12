class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        Set<Character> seen = new HashSet<>();
        Map<Character, Integer> lastSeen = new HashMap();
        while( end < s.length()){
            while(seen.contains(s.charAt(end))){
                    seen.remove(s.charAt(start));
                    start++;
                 System.out.println("updated start "+ s.substring(start, end));
            }
                seen.add(s.charAt(end));
                maxLength = Math.max(maxLength , end - start + 1);
                end++;
            
               
             System.out.println("Max "+ maxLength);
           
        }
        return maxLength;
    }
}
