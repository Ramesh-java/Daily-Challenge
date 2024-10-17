class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1.0;
        }

        long N=n;
        while(N<0){
            x=1/x;
            N=-N;
        }

        double currProduct=x;
        double result=1.0;

        while(N>0){
            if(N%2==1){
                result*=currProduct;
            }
            currProduct*=currProduct;
            N/=2;
        }return result;
    }
}