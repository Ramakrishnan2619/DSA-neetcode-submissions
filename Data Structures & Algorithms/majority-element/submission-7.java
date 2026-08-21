class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = nums.length/2;

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        
            if(map.get(i)>res){
                return i;
            }
        }
        
        return -1;
    }
}