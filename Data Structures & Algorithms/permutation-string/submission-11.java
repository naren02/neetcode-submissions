class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1len = s1.length();
        int[] s1freq = new int[26];
        int j = 0;
        if (s1.length() > s2.length()) {
            return false;
        }
        while (j < s1.length()) {
            s1freq[s1.charAt(j) - 'a']++;
            j++;
        }

        // System.out.println(Arrays.toString(s1freq));
        int l = 0;
        int r = s1len;
        System.out.println(" r " + r);

        int[] s2freq = new int[26];
        int k = 0;
        while (k < r) {
            System.out.println(s2.charAt(k));
            s2freq[s2.charAt(k) - 'a']++;
            k++;
        }
        while (r < s2.length()) {
            if (Arrays.equals(s1freq, s2freq)) {
                return true;
            }
            s2freq[s2.charAt(l) - 'a']--;
            s2freq[s2.charAt(r) - 'a']++;
            l++;
            r++;
        }
        return Arrays.equals(s1freq, s2freq);
    }
}
