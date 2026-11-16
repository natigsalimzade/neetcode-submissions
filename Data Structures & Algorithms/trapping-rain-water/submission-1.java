class Solution {
    public int trap(int[] height) {
        int volume = 0;
        int left = 0;
        int right = height.length - 1;
        int maxLeft = height[left];
        int maxRight = height[right];

        while (left < right) {

            if(maxLeft<=maxRight){
                left++;
                if(height[left]>=maxLeft){
                    maxLeft = height[left];
                }
                volume += maxLeft - height[left];

            } else {
                right--;
                if(height[right]>=maxRight){
                    maxRight = height[right];
                }
                volume += maxRight - height[right];

            }


        }
        return volume;
    }
}
