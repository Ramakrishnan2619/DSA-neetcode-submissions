class Solution {
    public int findMin(int[] nums) {
        int i =0;
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        while(i <n){
            if(nums[i]<min){
                min = nums[i];
            }
            i++;
        }
        return min;
        
    }
}
