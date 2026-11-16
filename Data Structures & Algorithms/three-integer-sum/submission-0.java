class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> threeSum = new ArrayList<>();

        for(int i = 0; i< nums.length-1; i++){
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                List<Integer> list = new ArrayList<>();
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    left++;
                    if(!threeSum.contains(list)) {
                        threeSum.add(list);
                    }
                    continue;
                }

                if(sum > 0){
                    right--;
                    continue;
                }

                left++;
            }
        }

        return threeSum;
    }
}
