class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=(n*(n+1))/2;
        int sum1=0;
       for(int i=1;i<=n;i++){
        if(i%m==0){
            sum1+=i;
        }
        }
        int a=sum-sum1;

       return a-sum1;
    }
}