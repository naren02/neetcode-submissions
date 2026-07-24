class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
           
            int j = 0;
            int prod = 1;
            
           
            
            while(j < nums.length ){
                 if(i == j){
               // System.out.println(" i "+i+" j "+j);
                j++;
                continue;
                 }
               // System.out.println(" i "+i+" j "+j+ " nums[i] "+ nums[j] + " prod " + prod);
                prod = prod * nums[j++];
            }
            // System.out.println(" i "+i+" j "+j+" prod " + prod);
            result[i] = prod;
        }
        return result;
    }
}  
