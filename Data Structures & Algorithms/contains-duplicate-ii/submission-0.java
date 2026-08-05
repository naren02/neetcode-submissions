class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      //  int i = 0;
      //  int j = 1;
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
           int j = i+1;
            while(j < nums.length && j - i <= k){
                if(nums[i] == nums[j]){
                    return true;
                }
                else{
                    j++;
                }
        }
        }
        return false;
        
    }
}