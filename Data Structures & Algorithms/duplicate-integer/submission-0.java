class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            h.add(nums[i]);
            
        }
        int l1=nums.length;
        int l2=h.size();
        if(l1!=l2){
            return true;
        }
        return false; 
    }
}