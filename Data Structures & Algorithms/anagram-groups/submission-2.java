class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap();
        char[] chars;
       for(String str : strs){
            int i = 0;
            chars = new char[26];
            while(i < str.length()){
                chars[str.charAt(i) - 'a']++;
                i++;
            }
            String aKey = Arrays.toString(chars);
            anagramMap.putIfAbsent(aKey, new ArrayList());
            anagramMap.get(aKey).add(str) ;  
       } 
       return new ArrayList(anagramMap.values());
    }
}
