class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       int i = 0;
       Arrays.sort(nums);
      // List<List<Integer>> triplets = new ArrayList();
       Set<List<Integer>> uniqueLists = new LinkedHashSet();
       while(i < nums.length - 2){
        int j = i + 1;
        int k = nums.length-1;
        while(j < k ){
           if(nums[i] > -(nums[j] + nums[k])){
                 k--; 
           } else  if(nums[i] < -(nums[j] + nums[k])){
                 j++; 
           }
           else{
            uniqueLists.add(Arrays.asList(nums[i], nums[j] , nums[k]));
            j++; k--;
        }
        
        }
        i++; 
       } 
       return new ArrayList(uniqueLists);
    }
}
