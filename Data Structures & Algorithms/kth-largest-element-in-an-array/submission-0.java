class Solution {
    public int findKthLargest(int[] nums, int k) {
         Arrays.sort(nums);
        System.out.println(nums);
        return nums[nums.length - k];
    }
}
