class Solution {
    public int[] twoSum(int[] nums, int target) {
       int i = 0; 
       int j = 0;
       while(i <= nums.length-2){
         j = i+1;
            while(j <= nums.length-1){
            if(nums[i]+nums[j] == target){
                 return new int[]{i, j};
            }
            j++;
        }
        i++;    
       }
       // for(int i = 0; i < )
        return new int[]{i, j};
    }
}
