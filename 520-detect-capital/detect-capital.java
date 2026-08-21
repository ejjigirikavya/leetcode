class Solution {
    public boolean detectCapitalUse(String word) {
     
        char ch=word.charAt(0);
     return word.equals(word.toUpperCase()) ||
               word.equals(word.toLowerCase()) ||
               (Character.isUpperCase(ch)) &&
                word.substring(1).equals(word.substring(1).toLowerCase());
    }
}