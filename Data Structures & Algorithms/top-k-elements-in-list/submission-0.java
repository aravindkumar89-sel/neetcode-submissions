class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> resMap = new HashMap<Integer, Integer>();
        for (Integer i : nums) {
            resMap.put(i, resMap.getOrDefault(i, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>((a, b) -> resMap.get(a) - resMap.get(b));
        for (int num : resMap.keySet()) {
            heap.offer(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }

        return result;
    }
}
