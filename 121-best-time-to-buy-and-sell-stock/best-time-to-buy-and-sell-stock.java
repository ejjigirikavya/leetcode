class Solution {
    public int maxProfit(int[] prices) {
        int minPric=prices[0];
        int maxProc=0;
        int profit=0;
       for(int ele:prices){
   if(ele<minPric){
      minPric=ele;
       }
      profit=ele-minPric;
      if(profit>maxProc){
        maxProc=profit;
      }
       } 
       return maxProc;
    }
}