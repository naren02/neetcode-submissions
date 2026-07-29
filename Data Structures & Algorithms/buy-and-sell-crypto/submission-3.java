class Solution {
    public int maxProfit(int[] prices) {
        int maxProf = 0;
      for(int i = 0; i < prices.length-1; i++){
        for(int j = i+1; j<prices.length; j++ ){
            maxProf = Math.max(maxProf, prices[j] - prices[i]);

        }
      }
      return maxProf;
    }
}
