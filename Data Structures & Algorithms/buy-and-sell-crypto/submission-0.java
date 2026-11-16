class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;

        for(int i = 0; i<prices.length-1; i++){
            for(int j = i+1; j<prices.length; j++){
                int k = prices[j] - prices[i];
                if(k > 0 && k > max){
                    max = k;
                }
            }
        }

        return max;
    }
}
