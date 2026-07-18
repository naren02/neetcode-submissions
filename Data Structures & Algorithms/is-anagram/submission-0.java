class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }else{
            char[] schars = s.toCharArray();
            char[] tchars = t.toCharArray();
            HashMap<Character, Integer> charCount = new HashMap();
            for(char schar : schars){
                if(charCount.get(schar) != null){
                    charCount.put(schar, charCount.get(schar) + 1);
                }else{
                    charCount.put(schar,  1);
                }
            } 
            for(char schar : tchars){
                if(charCount.get(schar) != null){
                    charCount.put(schar, charCount.get(schar) + 1);
                }else{
                    charCount.put(schar,  1);
                }
            } 
            charCount.entrySet().stream().forEach(System.out::println);
           return !charCount.values().stream().anyMatch(count -> count %2 != 0);
        }
    }
}
