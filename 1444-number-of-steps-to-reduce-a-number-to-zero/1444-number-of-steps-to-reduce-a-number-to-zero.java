class Solution {
    public int numberOfSteps(int nums) {
        return counter(nums,0);
    }
    int counter(int nums,int steps){
        if(nums==0){
            return steps;
        }
        if(nums%2==0){
            return counter(nums/2,steps+1);
        }
        return counter(nums-1,steps+1);
    }
}