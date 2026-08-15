class Solution {
    public int[] twoSum(int[] nums, int target) {
        int m =0;int n=0;
        int k = nums.length;
        for(int i =0;i<k;i++){
            for(int j =i+1;j<k;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }


    return new int[]{};    
    }
}
