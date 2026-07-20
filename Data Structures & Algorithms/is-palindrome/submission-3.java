class Solution {
    public boolean isPalindrome(String s) {
       s =  s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       System.out.println(s);
       int l = 0;
       int r = s.length()-1;
       while(r > l ){
        if(s.charAt(l) == s.charAt(r)){
            l++;
            r--;
        }
        else{
            return false;
        }
       }
       return true;
    }
}
