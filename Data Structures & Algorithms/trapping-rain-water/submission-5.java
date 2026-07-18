class Solution {
    public int trap(int[] height) {
        // find the left max and right max from the height;
        // 0 2 0 3 1 0
        // li 
        
        
       // int i = 0;
        
        int tot = 0;
        for(int i = 0 ; i < height.length; i++){
            int l = 0 ; 
            int r = height.length-1;
            int leftMax = 0;
        int rightMax = 0;
            while( l < i){
                leftMax = Math.max(leftMax, height[l]);
                l++;
            }
            while( r > i){
                rightMax = Math.max(rightMax, height[r]);
                r--;
            }
            System.out.println(" Left Max "+ leftMax + " right max "+ rightMax + " i " + height[i]);

            tot = tot + Math.max(Math.min(leftMax, rightMax) - height[i], 0);
            System.out.println("total "+ tot);
        }
        return tot;
    }
}
