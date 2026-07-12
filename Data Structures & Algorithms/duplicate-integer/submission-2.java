class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i = 0; 
        Arrays.sort(nums);
        //int j = ;
        while(i < nums.length-1){
           
            if(nums[i] == nums[i+1]){
                return true;
            }
            i++;
        }
        return false;
    }
}