class Solution {
    public int reverseDegree(String s) {
        int sum=0;
       for(int i=0;i<s.length();i++){
        int normal=s.charAt(i)-'a'+1;
        int value=27-normal;
        sum+=(i+1)*value;
       } 
       return sum;
    }
}