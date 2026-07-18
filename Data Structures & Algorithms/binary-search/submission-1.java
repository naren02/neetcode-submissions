class Solution {
    public int search(int[] nums, int target) {
       int mid = nums.length /2;
       System.out.println(">>> "+mid);
       System.out.println(">>> "+ Arrays.toString(nums));
       if(mid == 0){
        return -1;
       }
       if(target == nums[mid]){
            return mid;
       }else if(target > nums[mid]){
            search(Arrays.copyOfRange(nums, mid + 1, nums.length-1), target);
       }else{
            search(Arrays.copyOfRange(nums, 0, mid), target);
       }
       return -1;
    }
}
