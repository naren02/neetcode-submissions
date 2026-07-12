class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap();
        for(String str : strs){
            int[] count = new int[26];
            for(int i = 0 ; i < str.length(); i++){
                count[str.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(count);
            anagramMap.putIfAbsent(key, new ArrayList<String>());
            List<String> values = anagramMap.get(key);
            values.add(str);
        }
        return new ArrayList(anagramMap.values());
    }
}
