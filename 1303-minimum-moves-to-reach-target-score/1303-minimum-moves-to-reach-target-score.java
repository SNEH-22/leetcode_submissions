class Solution {
    public int minMoves(int target, int d) {
        return counter(target,d,0);
    }
    int counter(int target,int d,int c){
        if(target==1){
            return c;
        }
        if(d==0){
            return c+ target-1;
        }
        if(d>0 && target%2==0){
            return counter(target/2,--d,++c);
        }
        return counter(target-1,d,++c);
    }
}