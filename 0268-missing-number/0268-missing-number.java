class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int idx=nums[i];

            if(nums[i]<nums.length && nums[idx]!=nums[i]){
                int temp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;
            }
            else{
                i++;

            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }return nums.length;
    }
}