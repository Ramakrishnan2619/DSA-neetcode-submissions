

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // This is the ArrayList you were thinking of to store the results
        List<List<Integer>> result = new ArrayList<>();
        
        // Step 1: Sort the array (Crucial for two pointers and skipping duplicates)
        Arrays.sort(nums); 

        // Step 2: Iterate through the array. 
        // We stop at nums.length - 2 because we need at least 3 numbers for a triplet.
        for (int i = 0; i < nums.length - 2; i++) {
            
            // Skip duplicate elements for our first number (nums[i])
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Set up the two pointers
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++; // Sum is too small, move left pointer up to a larger number
                } else if (sum > 0) {
                    right--; // Sum is too large, move right pointer down to a smaller number
                } else {
                    // We found a match! Add it to our ArrayList
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Move both pointers inward to look for the next potential combination
                    left++;
                    right--;

                    // Skip any duplicate elements for the second number (left pointer)
                    // so we don't accidentally add the exact same triplet again
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }
        
        return result;
    }
}