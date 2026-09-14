class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> mp=new HashMap<>();
       for(String ele:strs){
        char[] ch=ele.toCharArray();
        Arrays.sort(ch);
        String sorted=new String(ch);
        if(!mp.containsKey(sorted)){
            mp.put(sorted,new ArrayList<>());
        }
        mp.get(sorted).add(ele);
       }
        return new ArrayList<>(mp.values());
    }
}