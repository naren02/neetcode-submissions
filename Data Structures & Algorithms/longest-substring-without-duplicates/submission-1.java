class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max = 0;
        Set<Character> seen = new HashSet();
        //zxyzxyz e, s = z
        // pwwkew e, s p,   2
        while(end < s.length()){
          //  System.out.println(" char " + s.charAt(end) + " End "+ end + " start "+ start + " max "+ max) ;
            while(seen.contains(s.charAt(end))){
                    seen.remove(s.charAt(start));
                    start++;
            }
            seen.add(s.charAt(end));
            
            max = Math.max(max, end - start + 1);
            end++; 

        }
        return max;
    }
}
