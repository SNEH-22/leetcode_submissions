class Solution {
    public double myPow(double x, int n) {
       return ans(x,n); 
    }
    double ans(double x,int n){
        if(n==0){
            return 1;
        }
        if(n==Integer.MIN_VALUE){
            return 1/(ans(x,-(n+1))*x);
        }
        else if(n<0){
            return 1/ans(x,-n);
        }
         double temp=ans(x,n/2);
        if(n%2==0){
           
            return temp*temp;
        }
        
        else{
            return x*temp*temp;
        }
    }
}