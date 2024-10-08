class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans =new ArrayList();
        int i=0;
        while(i<nums.length){
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
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(nums[j]);
            }

        } return ans;
        
    }
}