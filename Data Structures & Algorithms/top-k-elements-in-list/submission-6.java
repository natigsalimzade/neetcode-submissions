class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.merge(num, 1, Integer::sum);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            int freq = e.getValue();
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(e.getKey());
        }

        int[] result = new int[k];
        int idx = 0;
        for (int freq = buckets.length - 1; freq > 0 && idx < k; freq--) {
            if (buckets[freq] == null) continue;
            for (int num : buckets[freq]) {
                result[idx++] = num;
                if (idx == k) return result;
            }
        }
        return result;
    }
}
