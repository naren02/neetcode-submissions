class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> anogramMap = new HashMap();
        for(String str : strs){
            int[] count = new int[26];
           
            char[] strchars = str.toCharArray();
            for(int i = 0; i < strchars.length; i ++){
                count[strchars[i]-'a']++;
            }
            String key = Arrays.toString(count);
            anogramMap.putIfAbsent(key, new ArrayList());
            anogramMap.get(key).add(str);
        }
        return new ArrayList<>(anogramMap.values());
    }
}
