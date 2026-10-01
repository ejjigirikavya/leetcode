class Solution {
    public int subarraySum(int[] nums, int k) {
      HashMap<Integer,Integer> hp=new HashMap<>();
      int Currsum=0;
      int count=0;
      hp.put(0,1);
      for(int ele:nums){
       Currsum+=ele;
       int prev=Currsum-k;
       if(hp.containsKey(prev)){
        count+=hp.get(prev);
       }
       hp.put(Currsum,hp.getOrDefault(Currsum,0)+1);
      } 
      return count;

    }
}