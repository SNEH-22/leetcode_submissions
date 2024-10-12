class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i+1]<nums[i]){
                count++;
            }
            else if(i==nums.length-1 && nums[0]<nums[i]){
                count++;
            }
            
        }
        if(count<=1){
            return true;
        }
        else{
            return false;
        }
    }
}