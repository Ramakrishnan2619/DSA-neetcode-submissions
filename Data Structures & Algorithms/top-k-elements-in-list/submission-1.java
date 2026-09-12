

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each number
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }

        // Step 2: Create buckets where index = frequency
        // Using Object[] to avoid generic array creation limitations
        List<Integer>[] freqBuckets = new List[nums.length + 1];
        for (int i = 0; i <= nums.length; i++) {
            freqBuckets[i] = new ArrayList<>();
        }

        // Step 3: Populate the buckets
        for (int key : countMap.keySet()) {
            int freq = countMap.get(key);
            freqBuckets[freq].add(key);
        }

        // Step 4: Extract the top k frequent elements
        int[] result = new int[k];
        int index = 0;
        
        for (int i = freqBuckets.length - 1; i >= 0 && index < k; i--) {
            for (int n : freqBuckets[i]) {
                result[index++] = n;
                if (index == k) {
                    break;
                }
            }
        }

        return result;
    }
}