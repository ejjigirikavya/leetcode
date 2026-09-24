class Solution {
    public int smallestIndex(int[] nums) {
      int n=nums.length;
      for(int i=0;i<n;i++){
        int value=nums[i];
        int sum=0;
        while(value>0){
            int rem=value%10;
            sum+=rem;
            value=value/10;
        }
        if(sum==i){
            return i;
        }
      }
    return -1;
    }
}