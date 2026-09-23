class Solution {
    public String addBinary(String a, String b) {
        int A = a.length() - 1;
        int B = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (A >= 0 || B >= 0 || carry > 0) {
            int digitA = 0;
            int digitB = 0;
            if (A >= 0) {
                digitA = a.charAt(A) - '0';
                A--;
            }
            if (B >= 0) {
                digitB = b.charAt(B) - '0';
                B--;
            }
            int sum = digitA + digitB + carry;
            result.append(sum % 2);
            carry = sum / 2;
        }
 return result.reverse().toString();
    }
}