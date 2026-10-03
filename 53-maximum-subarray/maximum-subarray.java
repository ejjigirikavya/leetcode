class Solution {
    public int maxSubArray(int[] nums) {
        int ans=nums[0];
        int cs=0;
        for(int ele:nums){
            cs=Math.max(cs+ele,ele);
            ans=Math.max(ans,cs);
        }
        return ans;
        
    }
}