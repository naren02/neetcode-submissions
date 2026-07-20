class Solution {
    public int maxArea(int[] heights) {
        int l = 0; 
        int r = 0;
        HashMap<Integer, Integer> containerMap = new HashMap();
        for(int i = 0; i < heights.length-1; i++){
            int maxCapacity = 0;
            for(int j = i+1; j < heights.length; j++ ){
                int capacity = Math.min(heights[i], heights[j]);
                capacity = capacity * (j - i);
                maxCapacity = Math.max(maxCapacity, capacity);

            }
            containerMap.put(i, maxCapacity);
        }
       int max =  containerMap.values().stream().max(Integer :: compareTo).get();
       return max;
    }
}
