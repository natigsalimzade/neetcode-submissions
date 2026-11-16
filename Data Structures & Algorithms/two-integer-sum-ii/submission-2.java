class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] twoSum = new int[2];

        while(left < right){
            if(numbers[left] + numbers[right] == target){
                twoSum[0] = left + 1;
                twoSum[1] = right + 1;
                break;
            }

            if(numbers[right] + numbers[left] > target){
                right--;
                continue;
            }

            if(numbers[right] + numbers[left] < target){
                left++;
            }
        }

        return twoSum;
    }
}
