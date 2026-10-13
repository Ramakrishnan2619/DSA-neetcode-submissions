class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate width between pointers
            int w = right - left;
            
            // Container height is limited by the shorter bar
            int h = Math.min(heights[left], heights[right]);
            int area = w * h;

            maxArea = Math.max(maxArea, area);

            // Always shift the shorter side inward to try and find a taller bar
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}