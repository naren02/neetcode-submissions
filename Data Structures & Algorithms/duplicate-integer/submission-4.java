class Solution {
    public boolean hasDuplicate(int[] nums) {
       
        HashSet<Integer> uniqueNums = new HashSet<Integer>();
        for(int num :  nums){
           if(!uniqueNums.add(num)){
                return true;
           }
        }
        return false;
    }
}