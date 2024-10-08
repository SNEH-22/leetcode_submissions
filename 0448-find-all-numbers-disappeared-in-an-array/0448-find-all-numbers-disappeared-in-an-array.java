class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans=new ArrayList();
        int i=0;
        while(i<nums.length){
            int idx=nums[i]-1;
            if(nums[idx]!=nums[i]){
                int temp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(j+1);
            }
        }return ans;
    }
}