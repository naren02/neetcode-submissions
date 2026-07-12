class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
        cleaned = cleaned.toLowerCase();
        char[] chars = cleaned.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        //System.out.println(cleaned);
        while(j>i){
          //  System.out.println(chars[i]);
          //  System.out.println(chars[j]);
            if(chars[i] == chars[j]){
                i++;
                j--;
            }else{
                return false;
            }
        }
      //  System.out.println(s);
        return true;
    }
}
