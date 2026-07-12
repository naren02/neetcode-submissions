class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }else{
            char[] schars = s.toCharArray();
            char[] tchars = t.toCharArray();
            HashMap<Character, Integer> charCount = new HashMap();
             HashMap<Character, Integer> tcharCount = new HashMap();
            for(char schar : schars){
                if(charCount.get(schar) != null){
                    charCount.put(schar, charCount.get(schar) + 1);
                }else{
                    charCount.put(schar,  1);
                }
            } 
            for(char schar : tchars){
                if(tcharCount.get(schar) != null){
                    tcharCount.put(schar, tcharCount.get(schar) + 1);
                }else{
                    tcharCount.put(schar,  1);
                }
            } 
          return  charCount.size() == tcharCount.size() && 
    charCount.entrySet().stream()
        .allMatch(e -> e.getValue().equals(tcharCount.get(e.getKey())));
          }
    }
}
