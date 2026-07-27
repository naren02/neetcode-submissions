class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i = 0; 
        int[] op = new int[nums.length];
        op[0] = 1;
        for(i = 1; i < nums.length; i++){
            op[i] = op[i-1] * nums[i-1];
        }
        int rp = 1;
        for( i = i-1 ; i >= 0; i-- ){
            op[i] = op[i] * rp;
            rp = rp * nums[i];
        }
        return op;
    }
}  
