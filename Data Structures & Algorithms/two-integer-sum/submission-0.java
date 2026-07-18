class Solution {
    public int[] twoSum(int[] nums, int target) {
       int i = 0; 
       int j = i+1;
       while(i < nums.length-2 && j < nums.length-1){
            if(nums[i]+nums[j] == target)
                return new int[]{i, j};
       }
       // for(int i = 0; i < )
    }
}
