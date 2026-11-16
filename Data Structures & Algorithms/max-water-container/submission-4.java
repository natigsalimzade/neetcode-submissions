class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int left = 0;
        int right = heights.length - 1;


        while(left < right){
            int width = (right - left);
            int height = heights[right];
            if(heights[left] < heights[right]){
                height = heights[left];
            }
            int area = width * height;

            if(area > maxArea){
                maxArea = area;
            }

            if(heights[left] < heights[right]){
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
