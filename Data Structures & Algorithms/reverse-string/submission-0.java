class Solution {
    public void reverseString(char[] s) {
        if(s == null || s.length == 0){
            return;
        }
        int i = 0;
        int j = s.length-1;
        while(i<j){
            if(s[i] == s[j]){
                //skipp
                i++;
                j--;
            }else{
                char t = s[i];
                s[i] = s[j];
                s[j] = t;
                j--;
                i++;
            }
        }
    }
}