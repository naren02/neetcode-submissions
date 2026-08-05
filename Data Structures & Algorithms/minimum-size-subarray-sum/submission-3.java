class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while(i < nums.length && j < nums.length){
            sum = sum + nums[j];
            while(target <= sum){
                min = Math.min(min, j - i + 1);
                sum = sum - nums[i];
                i++;
            }
            j++;
        }
        return min != Integer.MAX_VALUE? min : 0;
    }
}