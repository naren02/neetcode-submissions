class Solution {
    public boolean hasDuplicate(int[] nums) {
      Set<Integer> numSet = new HashSet<>();
      for(int num : nums){
         numSet.add(num);
      }
       if(numSet.size() == nums.length){
        return false;
       }else{
        return true;
       }
    } 
    
}