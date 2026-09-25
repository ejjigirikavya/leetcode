class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer> mp=new HashMap<>();
       ArrayList<Integer> result=new ArrayList<>();
       for(int ele:nums1){
        if(mp.containsKey(ele)){
            mp.put(ele,mp.get(ele)+1);
        }
        else{
            mp.put(ele,1);
        }

       } 
       for(int ele:nums2){
        if(mp.containsKey(ele) && mp.get(ele)>0){
            //mp.get(ele);
            result.add(ele);
        
        mp.put(ele, mp.get(ele) - 1);
       }
       }
       int[] ans=new int[result.size()];
       for(int i=0;i<result.size();i++){
        ans[i]=result.get(i);
       }
       return ans;
    }
}