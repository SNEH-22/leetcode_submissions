class Solution {
    public int firstMissingPositive(int[] nums) {
        //ArrayList<Integer> ans=new Arraylist();
        int i=0;
        while(i<nums.length){
            if(nums[i]>0 && nums[i]<nums.length){
                int id=nums[i]-1;
                if(nums[i]!=nums[id]){
                    int temp=nums[i];
                    nums[i]=nums[id];
                    nums[id]=temp;
                }
                else{
                    i++;
                }
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){

                if(nums[j]!=j+1){
                    return j+1;
                }
            
        }
        return nums.length+1;
    }
}