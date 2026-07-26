class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] chars = new char[26];
        int i = 0;
        while(i < s.length()){
            chars[s.charAt(i) - 'a']++;
            chars[t.charAt(i) - 'a']--;
            i++;
        }
        for(char c : chars){
            if(c != 0){
                return false;
            }
        }
        return true;
    }
}
