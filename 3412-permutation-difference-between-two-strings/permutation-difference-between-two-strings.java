class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        for(char ch:s.toCharArray()){
            int index1=s.indexOf(ch);
            int index2=t.indexOf(ch);
            if(index1!=index2){
               sum+=Math.abs(index1-index2);
            }
        }
        return sum;
    }
}