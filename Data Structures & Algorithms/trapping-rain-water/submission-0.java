class Solution {
    public int trap(int[] height) {
      // 2 step process 
      // for every row find the let most and right most tallest 
      // brute force
      // step2 min(lheight, rh) - height = 
      int[] leftH = new int[height.length];
      int[] rightH = new int[height.length];
      int sum = 0;
      for(int i = 0; i < height.length; i++){
        int left = 0;
        int right = 0;
        // right height
        for(int j =  i+1; j < height.length; j++ ){
            if(height[j] > right){
                right = height[j];
            }
        }
        rightH[i] = right;
        //left height
        for(int l = i; l > 0; l--){
            if(height[l] > left){
                left = height[l];
            }
        }
        leftH[i] = left;
        // Find water trapped 
        int minH = 0;
        if(right >= left){
            minH = left;
        }else{
            minH = right;
        }
        if(minH - height[i] > 0){
            sum = sum + (minH - height[i]);
        }
        System.out.println("Height "+height[i]+"Left "+left + " right "+ right);
      }  
      return sum;
    }
}
