class Solution {
    public boolean checkInclusion(String s1, String s2) {
       
        int s1len = s1.length();
        int[] s1freq = new int[26];
        int j= 0;
        while(j < s1.length()){
            s1freq[s1.charAt(j) - 'a']++;
            j++;
        }
           
       // System.out.println(Arrays.toString(s1freq)); 
        int i = 0;
         int[] s2freq = new int[26];
        
        while(i + s1len <= s2.length()){
            String s2sub = s2.substring(i, i+s1len);
           int k = 0;
           s2freq = new int[26];
            while(k <  s2sub.length()){
                s2freq[s2sub.charAt(k) - 'a']++;
                k++;
            }
             if(Arrays.equals(s1freq, s2freq)){
                return true;
             }
            i++;
        }
        return false;
    }
}
