class Solution {
    public int countDigits(int num) {
        int count=0;
        int value=num;
        while(num!=0){
            int rev=num%10;
            //value+=rev;
            if(value%rev==0){
            count++;
            }
            num=num/10;
        }
return count;
    }
}