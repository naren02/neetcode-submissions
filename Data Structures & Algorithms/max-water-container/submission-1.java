class Solution {
    public int maxArea(int[] heights) {
        int l = 0; int r = heights.length-1;
        int max = 0;
        while(r > l){
            int cap = (r - l) *Math.min(heights[l], heights[r]);
            max = Math.max(cap, max);
          int ind=  (heights[l] >  heights[r]) ? r-- : l++;
        }
        return max;
    }
}
