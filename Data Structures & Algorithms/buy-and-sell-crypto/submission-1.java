class Solution {
    public int maxProfit(int[] prices) {
      int minPrice = prices[0];
      int maxProf = 0;
      for(int i = 1; i< prices.length; i++){
        System.out.println(minPrice);
        int profit = prices[i]- minPrice;
        maxProf = Math.max(maxProf, profit);
        minPrice = Math.min(minPrice, prices[i]);
        System.out.println(maxProf);
      } 
      return maxProf;
    }
}
