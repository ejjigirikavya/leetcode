class Solution {
    public char findTheDifference(String s, String t) {
        int result=0;
        for(int c:s.toCharArray()){
            result^=c;
        }
        for(int ch:t.toCharArray()){
            result^=ch;
        }
        return (char)result;
    }
}