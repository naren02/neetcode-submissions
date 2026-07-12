class Solution {
    public boolean hasDuplicate(int[] nums) {
       Arrays.sort(nums);
        
        int i = 0;
        int j = i + 1;
        while(i < nums.length-1 && j < nums.length ){
                if(nums[i] == nums[j]){
                    return true;
                }else{
                    i++;
                    j++;
                    
                }
        }
        return false;
        
    }
}