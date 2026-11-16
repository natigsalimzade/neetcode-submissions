class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int slow = 0;
        int fast = 0;

        while (true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast){
                break;
            }
        }

        int p = 0;
        while (true) {
            p = nums[p];
            slow = nums[slow];
            if(p == slow){
                return p;
            }
        }
    }
}
